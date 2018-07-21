package cn.ximcloud.itsource.day29._98teachercode._05Talk;

import java.io.IOException;

public class ServerThread extends Thread {
    Server server;

    public ServerThread(Server server) {
        this.server = server;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String msg = this.server.dis.readUTF();
                this.server.ta.append(msg);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}