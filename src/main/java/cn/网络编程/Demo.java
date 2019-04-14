package cn.网络编程;

import java.net.Socket;

public class Demo {
    public static void main(String[] args) {
        String host = "localhost";
        if (args.length > 0 ) {
            host = args[0];

        }

        new Demo().scan(host);

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
}
