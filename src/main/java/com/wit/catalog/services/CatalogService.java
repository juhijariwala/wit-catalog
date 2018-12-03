package com.wit.catalog.services;

import com.wit.catalog.mapper.CatalogMapper;
import com.wit.catalog.mapper.MyBatisUtil;
import com.wit.catalog.model.Item;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CatalogService {
    private CatalogMapper catalogMapper;

    private SqlSession sqlSession;

    public CatalogService() {
        this(MyBatisUtil.getSqlSessionFactory().openSession());
    }

    public CatalogService(SqlSession sqlSession) {
        this.sqlSession= sqlSession;
        this.catalogMapper = sqlSession.getMapper(CatalogMapper.class);
    }


    public List<Item> fetchItems() {
        List<Item> items = catalogMapper.fetch();
        sqlSession.commit();
        return items;
    }
}