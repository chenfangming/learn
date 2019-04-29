package test.cn;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

public class TestDemo {
    @Test
    public void test() throws InterruptedException, UnsupportedEncodingException {
        long l = System.currentTimeMillis();
        Thread.sleep(100);
        System.out.println(System.currentTimeMillis() - l);

        String a = new String();
        System.out.println(a);
    }
}
