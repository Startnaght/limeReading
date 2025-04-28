package com.reading.util;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
//@Data
public class reStruct {
    private String TimeDate(){
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }



    /**
     *
     *
     * @param data 带返回的类处理
     * @return
     * @author changan
     * @create 错误信息
     **/
    public HashMap<String,Object> ReJsonErr(ArrayList<String> data){
        HashMap<String,Object> ReLog = new HashMap<>();
        ReLog.put("code",netWorkCode.FAIL);
        ReLog.put("requestsHead",data.get(0));
        ReLog.put("message","数据请求失败");
        ReLog.put("授权信息",netWorkCode.UNAUTHORIZED);
//    ReLog.put("data",data.get(1));
        ReLog.put("returnDate","暂无");
        ReLog.put("timeDate",TimeDate());
        return ReLog;
    }


    /**
     *
     *
     * @param data 返回数据处理返回的市data arrlist<>string</>
     * @return requests Success rgion 返回一个HASHMAP 的对象
     * @author changan
     * @create return path networkPath returnTime netWorkCode CHANGAN_KEY
     **/
    public HashMap<String,Object> ReJsonSuccess(ArrayList<String> data){
        HashMap<String,Object> Succes = new HashMap<>();
        Succes.put("netWorkCode",netWorkCode.SUCCESS);
        Succes.put("timrDate",TimeDate());
        Succes.put("NetworkPath",data.get(1));
        Succes.put("netWorkCodeKey",data.get(0));
//        Succes.put("refPath",data.get(2));
//        Succes.put("ClientIp",data.get(3));
        return Succes;

    }
    /**
     *
     *
     * @param data 返回具体数据 返回内容以arrlist形式返回
     * @return
     * @author changan
     * @create  now and encryption type
     **/
    public HashMap<String,Object> ReJsonGetAndEncryption(ArrayList<String> data){
        return ReJsonErr(data);
    }

    public HashMap<String,String> Success(){
        HashMap<String,String> Succes = new HashMap<>();
//        Succes.put("data",data);
        Succes.put("timeDate",TimeDate());
        Succes.put("netWorkCode",netWorkCode.SUCCESS.toString());
        Succes.put("helowp ","LimeReading 欢迎使用此平台 请注册账号");
        return Succes;
    }
}
