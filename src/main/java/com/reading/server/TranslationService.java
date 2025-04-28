package com.reading.server;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public interface TranslationService {
    /**
     * 异步翻译文本段落
     * @param text 待翻译文本
     * @param sourceLang 源语言 (auto-detection if null)
     * @param targetLang 目标语言 (ISO 639-1代码)
     * @return 携带翻译结果的Future
     */
    CompletableFuture<String> translateAsync(String text, String sourceLang, String targetLang);

    /**
     * 批量翻译缓存预热
     * @param glossary 领域术语表
     */
    void preloadGlossary(Map<String, String> glossary);
}
