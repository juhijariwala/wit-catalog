package com.wit.catalog.mapper;

import com.wit.catalog.model.Item;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CatalogMapper {
    @Select(
            "SELECT id, name, price, description FROM item"
    )
    List<Item> fetch();

    @Select(
            "SELECT id, name, price, description FROM item WHERE id = #{id}"
    )
    Item fetchItem(int id);

    @Insert(
            "INSERT into item (name,description,price) VALUES(#{name},#{description},#{price});"
    )
    void addItem(Item item);
}

