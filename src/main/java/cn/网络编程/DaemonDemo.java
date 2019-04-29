package cn.网络编程;

public class DaemonDemo {
    public static void main(String[] args) {
        Thread threadDemo = new Thread(() -> {
            try {
                System.out.println("I am alive");
                Thread.sleep(500);


            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("finally block ");
            }
        });
        threadDemo.setDaemon(true);
        threadDemo.start();
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
