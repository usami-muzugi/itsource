package cn.ximcloud.itsource.before.day28_io_stream_2.homework;

/**
 * Created by IntelliJ IDEA.
 * Student: Wizard
 * Date: 2018-07-17
 * Time: 23:40
 * ProjectName: itsource
 * To change this template use File | Settings | File Templates.
 * ////////////////////////////////////////////////////////////////////
 * //                          _ooOoo_                               //
 * //                         o8888888o                              //
 * //                         88" . "88                              //
 * //                         (| ^_^ |)                              //
 * //                         O\  =  /O                              //
 * //                      ____/`---'\____                           //
 * //                    .'  \\|     |//  `.                         //
 * //                   /  \\|||  :  |||//  \                        //
 * //                  /  _||||| -:- |||||-  \                       //
 * //                  |   | \\\  -  /// |   |                       //
 * //                  | \_|  ''\---/''  |   |                       //
 * //                  \  .-\__  `-`  ___/-. /                       //
 * //                ___`. .'  /--.--\  `. . ___                     //
 * //              ."" '<  `.___\_<|>_/___.'  >'"".                  //
 * //            | | :  `- \`.;`\ _ /`;.`/ - ` : | |                 //
 * //            \  \ `-.   \_ __\ /__ _/   .-` /  /                 //
 * //      ========`-.____`-.___\_____/___.-`____.-'========         //
 * //                           `=---='                              //
 * //      ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^        //
 * //         佛祖保佑          永无BUG          永不修改             //
 * ////////////////////////////////////////////////////////////////////
 * 6、写出邮箱的正则表达式并测试（建议自己先去搜索或者注册不同的有邮箱体验他们的规则是什么）
 **/
public class HomeWork6 {
    public static void main(String[] args) {
        System.out.println(new String("715759898@qq.com").split("[{1-9a-zA-Z}@{1-9a-zA-Z}.{com,cn}]"));
    }
}