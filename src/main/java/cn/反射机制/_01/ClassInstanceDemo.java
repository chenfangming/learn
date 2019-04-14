package cn.反射机制._01;


/**
 * 获取类的三种方式
 */
public class ClassInstanceDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        //1
        Class<java.util.Date> stringClass = java.util.Date.class;
        //2
        java.util.Date str = new java.util.Date();
        Class<?> aClass = str.getClass();
        //3
        Class<?> aClass1 = Class.forName("java.util.Date");
        System.out.println(stringClass);
        System.out.println(aClass);
        System.out.println(aClass1);
        //同一个类在jvm中只存在一份字节码对象  第三种比较多

        Class<String> stringClass1 = String.class;
        Class<Byte> byteClass = Byte.class;
        Class<Byte> byteClass1 = byte.class;
        System.out.println(byteClass == byteClass1);

        System.out.println(Integer.max(1,20));
    }






}
