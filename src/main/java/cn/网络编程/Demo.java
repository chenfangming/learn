package cn.网络编程;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.math.BigDecimal;
import java.net.Socket;

public class Demo {
    public static void main(String[] args) {
        // new Demo().scan(host);
        String s = "";

    }

    private void scan(String host) {
        Socket socket = null;
        for (int port = 1; port < 1024; port++) {
            try {
                socket = new Socket(host, port);
                System.out.println("连接到端口：" + port);
            } catch (Exception e) {
                System.out.println("无法连接到端口：" + port);
            } finally {
                try {
                    if (socket != null) {
                        socket.close();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }
    }


    @Test
    public void test() {
        System.out.println(1);
        String jsonString = "{\n" +
                "  \"moneyDiscounts\":\"\",\n" +
                "  \"payType\":\"\",\n" +
                "  \"payCardId\":\"\",\n" +
                "  \"detailCode\":[\n" +
                "    {\n" +
                "      \"singleCode\":\"细码单\", \n" +
                "      \"sellerDiscountNum\":\"供应商采购优惠数量\"\n" +
                "    }\n" +
                "  ],\n" +
                "\n" +
                "  \"dkPrice\":\"档口价1,档口价2\",\n" +
                "  \"salePrice\":\"销售价1,销售价2\",\n" +
                "  \"takeType\":\"\",\n" +
                "  \"takeArea\":\"\",\n" +
                "  \"takeCity\":\"\",\n" +
                "  \"takeCircle\":\"\",\n" +
                "  \"takeAddress\":\"\",\n" +
                "  \"takeDkName\":\"\",\n" +
                "  \"takePhone\":\"\",\n" +
                "  \"takeMobile\":\"\"\n}";

      //  System.out.println(jsonString);
        JSONObject jsonObject = JSON.parseObject(jsonString);
        Object detailCode = jsonObject.get("detailCode");
        System.out.println(detailCode);

        JSONArray detailCode1 = JSON.parseArray(jsonObject.get("detailCode").toString());
        System.out.println(detailCode1.size());

    }

    @Test
    public void test1() {
        System.out.println(new BigDecimal("17693.00").multiply(new BigDecimal("0.015")));
        System.out.println(new BigDecimal("10353.00").multiply(new BigDecimal("0.015")));
    }
}
