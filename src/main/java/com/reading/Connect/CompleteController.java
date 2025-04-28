package com.reading.Connect;

import com.reading.databaseSql.staticSqlUser;
import com.reading.entity.codeUser;
import com.reading.util.netWorkCode;
import com.reading.util.openDabases;
import com.reading.util.reStruct;
import com.reading.util.returnNetwork;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api")
public class CompleteController {

@RequestMapping("/home")
public returnNetwork home(){


    return new returnNetwork<>(new reStruct().ReJsonSuccess(new ArrayList<String>(
           List.of("欢迎使用此类系统",
                   "12332342"
           ))));
}

/**
 *
 *
 * @param data 利用codeUser遍历上传数据 判断用户是否处于登陆状态
 * @return  若是登陆状态返回主页后缀home 若不是返回登注册服务状态 三种状态都不是返回成功状态不反悔任何登录后缀
 * @author changan
 * @create
 **/
@RequestMapping("/user")
public returnNetwork user(@RequestBody codeUser data){
    double name_uid =0 ;
    openDabases openDabases = new openDabases();
    ResultSet resultSet =  openDabases.selectData(data.getName_uid(),new staticSqlUser().getSelectSql());
    try {
        while (resultSet.next()) {
            name_uid = resultSet.getInt("name_uid");
        }
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
    if (name_uid == data.getName_uid()) {
        System.out.println("用户已注册~ 即将跳转登录页面");
        return new returnNetwork<>(new ArrayList<String>(List.of("注册用户错误", netWorkCode.nodeZhuCe.toString(),"3","/home")));
    }
    else{  //    per 指针暂时不适用，固定值为1
        System.out.println("用户注册开始");
        openDabases.insertData(new staticSqlUser().getCreateSql(),1,data);
    }
    return new returnNetwork<>(new reStruct().Success());
}


}
