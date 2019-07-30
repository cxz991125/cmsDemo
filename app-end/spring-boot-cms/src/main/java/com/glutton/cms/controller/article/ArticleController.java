package com.glutton.cms.controller.article;

import com.alibaba.fastjson.JSONObject;
import com.glutton.cms.dao.article.Article;
import com.glutton.cms.service.article.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: lijun_isf
 */
@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    IArticleService articleService;
    @RequestMapping("/add")
    public JSONObject addArticle(@RequestBody Article article){
        Assert.notNull(article.getCategoryId(), "未找到对应的栏目！");
        return articleService.insert(article);
    }

    @RequestMapping("/selectById")
    public JSONObject selectById(@RequestParam long articleId){
        return articleService.selectById(articleId);
    }
    @RequestMapping("/modify")
    public JSONObject modify(@RequestBody Article article){
        Assert.notNull(article.getId(), "未找到修改的文章！");
        return articleService.modify(article);
    }

    @RequestMapping("/delete")
    public JSONObject delete(@RequestBody Article article){
        Assert.notNull(article.getId(), "未找到删除的文章");
        return articleService.delete(article.getId());
    }
}
