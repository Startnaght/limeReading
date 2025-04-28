package com.reading.entity;

import lombok.Data;

/**
 * 用户类  用来获取新创建用户数据
 *
 * @param
 * @return
 * @author changan
 * @create
 **/
@Data
public class codeUser {
    private String name;
    private double name_uid;
    private double create_Time;
    private int pass;
//    private String img; //暂时不实现
    private String email;
}
