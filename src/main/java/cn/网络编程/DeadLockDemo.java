package cn.网络编程;

import com.mysql.fabric.xmlrpc.base.Params;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockDemo {
    private static String resource_a = "A";
    private static String resource_b = "B";

    public static void main(String[] args) {
        deadLock();
    }

    private static void deadLock() {
        Thread threadA = new Thread(() -> {
            synchronized (resource_a) {
                System.out.println("get resource_a");
                try {
                    Thread.sleep(3000);
                    synchronized (resource_b) {
                        System.out.println("get resource_b");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread threadB = new Thread(() -> {
            synchronized (resource_a) {
                System.out.println("get resource_a");
                    synchronized (resource_b) {
                        System.out.println("get resource_b");
                    }
                }
            });

        Lock lock = new ReentrantLock();
    }


    @Test
    public void test21() {
        String s = "[{\"sellerDiscountNum\":\"1\",\"singleCode\":\"20\"}]";
        String a = addSplitSymbolForDetailCode1(null, "29");
        System.out.println(a);
    }


    private static String addSplitSymbolForDetailCode1(Params params, String singleCode) {
        String[] detailCodeArr = singleCode.split(",");
        //以10为基准补逗号
        if (detailCodeArr.length % 10 > 0) {
            StringBuilder sbSp  = new StringBuilder(15);
            sbSp.append(singleCode);
            System.out.println( 10 - detailCodeArr.length %10);
            for (int i = 0; i < 10 - detailCodeArr.length % 10; i++) {
                sbSp.append(",");
            }
            return  sbSp.toString();

        }
        return singleCode;
    }

    @Test
    public void test() {
      /*  String s = "-10";
        BigDecimal b = new BigDecimal("20");
       b =  b.subtract(new BigDecimal(s));
        System.out.println(b);
*/
        double d = 33.999d;
        BigDecimal b = new BigDecimal(d);
       d =  b.setScale(2, RoundingMode.HALF_UP).doubleValue();
        System.out.println(d);
    }
}
