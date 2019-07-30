package com.glutton.cms.mapping.article;

import com.glutton.cms.dao.article.Article;
import com.glutton.cms.mapping.IBaseTableMapping;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper extends IBaseTableMapping<Article> {
}