package cn.ximcloud.itsource.day46_rebuild._01rebuild.servlet;


import cn.ximcloud.itsource.day46_rebuild._01rebuild.dao.impl.StudentImpl;
import cn.ximcloud.itsource.day46_rebuild._01rebuild.domain.Admin;
import cn.ximcloud.itsource.day46_rebuild._01rebuild.domain.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-13
 * Time: 12:10
 * ProjectName: itsource.cn.ximcloud.itsource.day45_javabean.homework.homework5.servlet
 * To change this template use File | Settings | Editor | File and Code Templates.
 * <p>
 * you are not expected to understand this.
 * <p>
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
 * //         佛祖保佑          永无BUG     永不修改                  //
 * ////////////////////////////////////////////////////////////////////
 * 主页面Servlet
 **/
@WebServlet(name = "day46_MainServlet", urlPatterns = "/day46/main")
public class MainServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Admin admin_in_session = (Admin) req.getSession().getAttribute("ADMIN_IN_SESSION");
        if (admin_in_session != null) {
//            有Session,获取一下
            StudentImpl student = (StudentImpl) getServletContext().getAttribute("student");
            ArrayList<Student> all = student.findAll();
            for (Student student1 : all) {
                System.out.println("Student:" + student1);
            }
            req.getSession().setAttribute("ALL_STUDENT_IN_SESSION", all);
            resp.sendRedirect("/day46/list.jsp");
        } else {
            resp.sendRedirect("/day46/errorPage.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/day46/errorPage.jsp");
    }
}
