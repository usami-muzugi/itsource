package cn.ximcloud.itsource.day29._99test._05Talk;

import java.io.IOException;

public class ServerThread extends Thread {
    MyServer myServer;

    public ServerThread(MyServer myServer) {
        this.myServer = myServer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String read = this.myServer.dis.readUTF();
                this.myServer.ta.append(read);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}