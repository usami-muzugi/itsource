package cn.ximcloud.itsource.day25._99test;

interface A {
    int x = 0;

}

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-12
 * Time: 12:33
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class Test extends B implements A {
    int x;

    public static void main(String[] args) {
        System.out.println(test());
    }

    static int test() {
        int x = 0;
        try {
            return x++;
        } finally {
            x = 100;
        }
    }

    public void pX() {
        System.out.println(x);
    }

}

class B {
    int x = 1;
}
