package cn.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class LambdaDemo {
    /**
     * jdk1.8之前
     */
    @Test
    public void test1() {
        try {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("1");
                }
            }).start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    /**
     * jdk1.8以后
     */
    @Test
    public void test2() {
        new Thread(
                () -> {
                    System.out.println(1);
                }
        ).start();
    }


    @Test
    public void test3() {
        // JDK7 匿名内部类写法
        List<String> list = Arrays.asList("I", "love", "you", "too");
        /// 接口名
        Collections.sort(list, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){// 方法名
                if(s1 == null) {
                    return -1;
                }
                if(s2 == null) {
                    return 1;
                }
                return s1.length()-s2.length();
            }
        });

    }

    @Test
    public void test4() {
        List<String> list = Arrays.asList("I", "love", "you", "too");
        /// 接口名
        Collections.sort(list, (s1, s2) -> {
            if(s1 == null) {
                return -1;
            }
            if(s2 == null) {
                return 1;
            }
            return s1.length()-s2.length();
        });
    }


    @Test
    public void test5() {
        Stream<String> stream = Stream.of("I", "love", "you");
        stream.filter(s -> s.length() == 3)
                .forEach(s -> System.out.println(s));
    }

    @Test
    public void test6() {
        Stream<String> stream = Stream.of("I", "love", "you", "too");
        stream.map(str -> str.toUpperCase())
                .forEach(str -> System.out.println(str));

    }
}
