package cn.ximcloud.itsource.day30.leveltest;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-19
 * Time: 14:13
 * ProjectName: ITSource.cn.ximcloud.itsource.day30.leveltest
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * 4.	现在给出两个数组，数组A: “1,7,9,11,13,15,17,19”;
 * 数组B:”2,4,6,8,10”，两个数组 合并之后数组C，在按照升序排列
 **/

public class Test_4 {
    /**
     * 将两个数组 合并之后新数组，在按照升序排列
     *
     * @param arr  第一个数组
     * @param comp 第二个数组
     * @return 返回一个被排序过得包含了这两个数组的新数组
     */
    public int[] solution(int[] arr, int[] comp) {
        //创建新数组，设置长度为两个数组的长度之和
        int[] temp = new int[arr.length + comp.length];
        boolean flag = true;
        for (int i = 0; i < temp.length; i++) {
            if (flag) {
                temp[i] = arr[i];
                if (i == arr.length - 1) flag = false;      //先添加第一个数组，再添加第二个数组
            } else {
                temp[i] = comp[i - arr.length];
            }
        }

        //冒泡算法进行排序
        int tempVal;
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp.length - 1 - i; j++) {
                if (temp[j] > temp[j + 1]) {
                    tempVal = temp[j];
                    temp[j] = temp[j + 1];
                    temp[j + 1] = tempVal;
                }
            }
        }
        //返回排序完成的数组
        return temp;
    }

    @Test
    public void test() {
        System.out.println(Arrays.toString(solution(new int[]{1, 23, 3, 4, 21, 123, 13, 25, 1}, new int[]{2, 2, 1, 312, 12, 4})));
    }
}
