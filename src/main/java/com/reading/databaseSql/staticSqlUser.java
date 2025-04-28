package com.reading.databaseSql;

//    private String name;
//    private double create_Time;
//    private int pass;

import lombok.Data;

/// /    private String img; //暂时不实现
//    private String email;
    @Data
public class staticSqlUser {
    private String createSql  = "insert into user (name,name_uid,create_time,pass,email) values (?,?,?,?,?,?)";
    private String selectSql = "from user";

    }
