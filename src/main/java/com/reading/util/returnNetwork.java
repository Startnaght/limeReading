package com.reading.util;

import lombok.Data;


@Data
public class returnNetwork<T> {
    private T data;
/**
 *
 *
 * @param data 返回泛型处理结果 是处理返回json的核心依赖
 * @return
 * @author changan
 * @create
 **/
    public returnNetwork(T data) {
        this.data = data;
        System.out.printf("Return Network Data: %s\n", data);
    }
    public returnNetwork(T data,String message) {
        this.data = data;
        System.out.println(message);
    }

}
