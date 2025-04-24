package com.reading.util;

import lombok.Data;
import net.sf.saxon.lib.SaxonOutputKeys;

/**
 *
 *
 * @param
 * @return  返回具体的json数据
 * @author changan
 * @create
 **/
@Data
public class returnNetwork<T> {
    private T data;

    public returnNetwork(T data) {
        this.data = data;
        System.out.printf("Return Network Data: %s\n", data);
    }
    public returnNetwork(T data,String message) {
        this.data = data;
        System.out.println(message);
    }

}
