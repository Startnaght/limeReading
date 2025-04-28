package com.reading.server;

import com.reading.server.serverImpl.OcrResult;

import java.awt.image.BufferedImage;
import java.nio.file.Path;

public interface OcrEngine {
    /**
     * 识别图片中的文字
     * @param image 预处理后的图像
     * @param language 语言代码组合 (e.g., "eng+chi_sim")
     * @param config 识别配置 (DPI/页面分割模式等)
     * @return 结构化识别结果 (含文本/表格/公式)
     */
    OcrResult recognize(BufferedImage image, String language, OcrConfig config) throws OcrException;

    /**
     * 训练自定义识别模型
     * @param trainingData 训练数据路径
     * @param outputModelPath 模型输出路径
     */
    void trainModel(Path trainingData, Path outputModelPath) throws TrainingException;
}
