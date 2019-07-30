package com.glutton.cms.service.article.impl;

import com.alibaba.fastjson.JSONObject;
import com.glutton.cms.dao.article.Article;
import com.glutton.cms.mapping.article.ArticleMapper;
import com.glutton.cms.service.article.IArticleService;
import com.glutton.cms.service.respmessage.IResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * @Author: lijun_isf
 */
@Service
public class ArticleServiceImpl implements IArticleService {
    @Autowired
    ArticleMapper articleMapper;
    @Autowired
    IResponseMessage resMsg;
    @Override
    public JSONObject insert(Article article) {
        article.setCreateDate(new Date());
        int articleId = articleMapper.insertSelective(article);
        return resMsg.success("添加成功", articleId);
    }

    @Override
    public JSONObject delete(long id) {
        int articleId = articleMapper.deleteByPrimaryKey(id);
        return resMsg.successDel(articleId);
    }

    @Override
    public JSONObject modify(Article article) {
        int articleId = articleMapper.updateByPrimaryKeySelective(article);
        return resMsg.successUpdate(articleId);
    }

    @Override
    public JSONObject selectById(long id) {
        Article article = articleMapper.selectByPrimaryKey(id);
        return resMsg.successQuery( article);
    }

    @Override
    public JSONObject selectList(Article article) {
        List<Article> list = articleMapper.select(article);
        return resMsg.successQuery(list);
    }


}
