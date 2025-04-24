package com.reading.entity;

import lombok.Data;

import java.io.BufferedReader;

/**
 *
 *
 * @param
 * @return
 * @author changan
 * @create 创建迭代类  实现对前端数据的结构化处理
 **/

@Data
public class CodeRequts {
    private String name; //用户名
    private double name_uid;  //用户id
    private String name_cooperation; //协作用户
    private double name_uid_cooperation; //协作id
    private String offline_time; //离线时间
    private double offline_time_uid; // 离线id
    private String offline_status; //状态
    private double offline_location; //离线字符位置
    private BufferedReader reader; //翻译字符流


}
