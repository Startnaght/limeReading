package com.reading.util;

import com.reading.entity.codeUser;

import java.sql.*;

/**
 *
 *
 * @param
 * @return
 * @author changan
 * @create  创建数据库接口  创建删除查询  都通过此子类开始
 **/
public class openDabases {
    private static Connection connection;   //创建链接的数据
    private static String JDBC ="jdbc:mariadb://192.168.0.100:3306/changanPlatform" ;
    public openDabases() {
            openDatabaesCoonection();


    }
//打开数据接口
    private void openDatabaesCoonection()  {
        System.out.printf("openDatabaesCoonection开始连接\n" +JDBC);

        try {
            connection = DriverManager.getConnection(JDBC,"root","10241225");
            System.out.println("connection  "+connection.isValid(5));
        } catch (SQLException e) {
            System.out.printf("NOT null open database connection +"+e.getMessage());
        }

    }
    //关闭数据库接口
    private void cloneDatabaesConnection()  {
        System.out.printf("cloneDatabaesConnection->关闭服务器同步");
        try {
            connection.close();
            System.out.printf("connection closed"+connection.isValid(5));
        } catch (SQLException e) {
            System.out.println("connection cloes error "+e.getMessage());
        }


    }


    /**
     *
     * @param insertSql 传入插入sql语句
     * @param per 指数器暂时没用
     * @param data 存储到数据的数据内容
     * @return
     * @author changan
     * @create  node data 需要传入一个判断字符 一个sql后半句  采用拼接组成sql查询条件
     **/
    public void insertData(String insertSql,int per, codeUser data) {
        try {
            PreparedStatement  ps = connection.prepareStatement(insertSql);
            if (per == 0 ){
                ps.setString(1,data.getName());
                ps.setDouble(2,data.getCreate_Time());
                ps.setInt(3,data.getPass());
                ps.setString(4,data.getEmail());
                ps.execute();
            }else if(per == 1){
//                ps.setInt(1,data.getId());
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

/**
 *
 *
 * @param per 传入查询数据
 * @param selectSql  传入查询sql后半部分
 * @return  返回Resulte类型数据
 * @author changan
 * @create 但不稳定sql传入需更改，往后再议~
 **/
    public ResultSet selectData(double per,String selectSql) {
        try {
            Statement Statement = connection.createStatement();
            ResultSet  resultSet = Statement.executeQuery("select" + per +selectSql);
            return resultSet;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
