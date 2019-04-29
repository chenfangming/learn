package cn.网络编程;

public class CreateThreadDemo {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                super.run();
            }
        };


    Thread t = new Thread(() -> {
        System.out.println(1);
    });

 //   ExecutorService s = Executors.newSingleThreadExecutor();
    /*    Future<String> submit = s.submit(() -> {
            return "1";
        });*/
    //    String s1 = submit.get();



    }
}
