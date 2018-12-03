package com.wit.catalog.mapper;

import com.wit.catalog.model.Item;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CatalogMapper {
    @Select(
            "SELECT id, name, price, description FROM items"
    )
    List<Item> fetch();
}

