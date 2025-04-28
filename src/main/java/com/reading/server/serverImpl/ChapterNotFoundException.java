package com.reading.server.serverImpl;

/**
 * 自定义异常类，用于处理章节未找到的情况
 */
public class ChapterNotFoundException extends Exception {
    public ChapterNotFoundException(String message) {
        super(message);
    }

    public ChapterNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}