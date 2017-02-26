package ubtms.module.community.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ubtms.module.community.dto.ArticleDto;
import ubtms.module.community.entity.Article;
import ubtms.module.community.entity.ArticleLimitObject;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by jinzhany on 2017/2/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class ArticleMapperTest {
    @Autowired
    private ArticleMapper articleMapper;

    @Test
    public void selectWithLimit() throws Exception {
        ArticleLimitObject<Article> articleArticleLimitObject = new ArticleLimitObject<Article>();
        articleArticleLimitObject.setOffset(0);
        articleArticleLimitObject.setLimit(10);
        Article article = new Article();
        articleArticleLimitObject.setData(article);
        article.setTitle("在");
        articleArticleLimitObject.setSchoolName("系统");
        List<ArticleDto> dtos = articleMapper.selectWithLimit(articleArticleLimitObject);
        System.out.println("***********************:"+articleMapper.countWithLimit(articleArticleLimitObject));
    }

}