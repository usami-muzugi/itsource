package cn.ximcloud.itsource.day40_deep_learning_jdbc.homework.homework5.cn.ximcloud.itsource.dao.impl;

import cn.ximcloud.itsource.day40_deep_learning_jdbc.homework.homework5.cn.ximcloud.itsource.dao.IBasicDao;
import cn.ximcloud.itsource.day40_deep_learning_jdbc.homework.homework5.cn.ximcloud.itsource.domain.Department;
import cn.ximcloud.itsource.day40_deep_learning_jdbc.homework.homework5.cn.ximcloud.itsource.util.Utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Author: wzard
 * Date: 2018-08-06
 * Time: 11:13
 * ProjectName: itsource.cn.ximcloud.itsource.day40_deep_learning_jdbc.homework.homework5.cn.ximcloud.itsource.dao.impl
 * To change this template use File | Settings | Editor | File and Code Templates.
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
 **/

public class DepartmentDaoImpl implements IBasicDao<Department> {
    private static Utils instance;

    static {
        instance = Utils.INSTANCE;
    }

    /**
     * 创建表
     */
    @Override
    public void createTable() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String sql = "CREATE TABLE `department` (\n" +
                "  `id` int(11) NOT NULL DEFAULT '0',\n" +
                "  `deptName` varchar(30) DEFAULT NULL,\n" +
                "  `teacherNumber` int(11) DEFAULT NULL,\n" +
                "  `studentNumber` int(11) DEFAULT NULL,\n" +
                "  PRIMARY KEY (`id`)\n" +
                ") ENGINE=InnoDB DEFAULT CHARSET=utf8;\n";
        try {
            connection = instance.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            instance.close(null, preparedStatement, connection);
        }

    }

    /**
     * 删除表
     */
    @Override
    public void dropTable() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String sql = "DROP TABLE department";
        try {
            connection = instance.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            instance.close(null, preparedStatement, connection);
        }
    }

    /**
     * 增
     *
     * @param department
     */
    @Override
    public void save(Department department) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String sql = "INSERT INTO department(deptName,teacherNumber,studentNumber) values (?,?,?)";
        try {
            connection = instance.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, department.getDeptName());
            preparedStatement.setInt(2, department.getTeacherNumber());
            preparedStatement.setInt(3, department.getStudentNumber());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            instance.close(null, preparedStatement, connection);
        }
    }

    /**
     * 删
     *
     * @param integer 通过id来删除
     */
    @Override
    public void delete(Integer integer) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String sql = "DELETE * FROM department WHERE id=?";
        try {
            connection = instance.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, integer);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            instance.close(null, preparedStatement, connection);
        }
    }

    /**
     * 改
     *
     * @param department 修改对象
     */
    @Override
    public void update(Department department) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String sql = "UPDATE department(deptName,teacherNumber,studentNumber) values (?,?,?) where id=?";
        try {
            connection = instance.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, department.getDeptName());
            preparedStatement.setInt(2, department.getTeacherNumber());
            preparedStatement.setInt(3, department.getStudentNumber());
            preparedStatement.setInt(4,department.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            instance.close(null, preparedStatement, connection);
        }
    }

    /**
     * @param integer
     * @return 通过id来查找对象
     */
    @Override
    public Department find(Integer integer) {
        return null;
    }

    /**
     * @return 查找所有的对象
     */
    @Override
    public List<Department> findAll() {
        return null;
    }
}
