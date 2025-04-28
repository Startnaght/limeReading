package com.reading.server.serverImpl;

import java.time.Year;
import java.util.*;

public class BookMetadata {
    private final String title;
    private final List<String> authors;
    private final String publisher;
    private final Year publishYear;
    private final String isbn;
    private final String language;
    private final byte[] coverImage;
    private final Map<String, String> customFields;  // 扩展字段

    // 使用Builder模式构造
    BookMetadata(Builder builder) {
        this.title = Objects.requireNonNull(builder.getTitle(), "书名不能为空");
        this.authors = Collections.unmodifiableList(builder.getAuthors());
        this.publisher = builder.getPublisher();
        this.publishYear = builder.getPublishYear();
        this.isbn = validateISBN(builder.getIsbn());
        this.language = builder.getLanguage() != null ?
                builder.getLanguage().toLowerCase(Locale.ROOT) : "unk";
        this.coverImage = builder.getCoverImage() != null ?
                Arrays.copyOf(builder.getCoverImage(), builder.getCoverImage().length) : new byte[0];
        this.customFields = Collections.unmodifiableMap(builder.getCustomFields());
    }

    private String validateISBN(String isbn) {
        if (isbn == null) return null;
        String cleaned = isbn.replaceAll("-", "");
        if (!cleaned.matches("^(97(8|9))?\\d{9}(\\d|X)$")) {
            throw new IllegalArgumentException("无效的ISBN格式: " + isbn);
        }
        return isbn;
    }
}
