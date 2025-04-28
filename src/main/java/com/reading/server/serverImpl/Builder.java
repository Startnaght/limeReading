package com.reading.server.serverImpl;

import lombok.Data;

import java.time.Year;
import java.util.*;
//builder构造器模式
@Data
public  class Builder {
    private String title = "Untitled";
    private List<String> authors = new ArrayList<>();
    private String publisher;
    private Year publishYear;
    private String isbn;
    private String language;
    private byte[] coverImage;
    private Map<String, String> customFields = new HashMap<>();


    public BookMetadata build() {
        return new BookMetadata(this);
    }
}