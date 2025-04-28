package com.reading.server;

import com.reading.server.serverImpl.BookMetadata;
import com.reading.server.serverImpl.BookParseException;
import com.reading.server.serverImpl.ChapterContent;
import com.reading.server.serverImpl.ChapterNotFoundException;

import java.io.File;
import java.util.List;

public interface bookParser {
        /**
         * 解析电子书元数据
         * @param file 电子书文件
         * @return 标准化元数据对象
         */
        BookMetadata parseMetadata(File file) throws BookParseException;

        /**
         * 提取章节内容
         * @param chapterIndex 章节索引
         * @return 包含文本/图片的混合内容
         */
        ChapterContent extractChapter(int chapterIndex) throws ChapterNotFoundException;

        /**
         * 获取书籍目录结构
         */
        List<Chapter> getTableOfContents();

}
