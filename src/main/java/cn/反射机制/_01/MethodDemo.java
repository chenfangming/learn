package cn.反射机制._01;

import java.lang.reflect.Method;

public class MethodDemo {
    class User{
        public void doWork() {}
        public void doWork(String name) {}
        private String hello(String name, int age) {
            return name + "," + age;
        }


    }

    public static void main(String[] args) throws Exception {

       // getAll();
        getOne();
    }

    private static void getOne() throws NoSuchMethodException {
        Class<User> userClass = User.class;
        Method doWork = userClass.getMethod("doWork");
        System.out.println(doWork);
        doWork = userClass.getMethod("doWork", String.class);
        System.out.println(doWork);
/// doWork = userClass.getMethod("hello", String.class, int.class);
///        System.out.println(doWork);
        doWork = userClass.getDeclaredMethod("hello", String.class, int.class);
        System.out.println(doWork);


    }

    private static void getAll() {
        Class<User> clz = User.class;
        Method[] methods = clz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }


        System.out.println("------------");
        Method[] methods1 = clz.getDeclaredMethods();
        for (Method methods2 : methods1) {
            System.out.println(methods2);
        }

    }
}
