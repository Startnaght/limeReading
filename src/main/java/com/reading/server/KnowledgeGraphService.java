package com.reading.server;

import com.reading.server.serverImpl.EntityRelation;
import com.reading.server.serverImpl.KnowledgeGraph;

import java.util.Set;

public interface KnowledgeGraphService {
    /**
     * 构建书籍知识图谱
     *
     * @param bookContent 书籍文本内容
     * @return 实体关系图
     */
    KnowledgeGraph buildGraph(String bookContent);

    /**
     * 查询关联实体
     *
     * @param entityName 实体名称
     * @param depth      关系深度
     */
    Set<EntityRelation> queryRelatedEntities(String entityName, int depth);
}
