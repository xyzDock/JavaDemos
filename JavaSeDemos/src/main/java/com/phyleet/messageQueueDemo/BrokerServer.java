package com.phyleet.messageQueueDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class BrokerServer implements Runnable {
    public static final int SERVICE_PORT = 9999;
    private final Socket socket;

    public BrokerServer(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter out = new PrintWriter(socket.getOutputStream());
        ) {
            while (true) {
                String str = in.readLine();
                if (str == null) {
                    continue;
                }
                System.out.println("接收到数据" + str);
                if ("consume".equals(str)) {
                    String msg = Broker.consume();
                    out.println(msg);
                    out.flush();
                } else {
                    Broker.produce(str);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
