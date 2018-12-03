package com.wit.catalog.services;

import org.springframework.stereotype.Service;

@Service
public class CatalogService {

    public String fetchItems() {
        return "items";
    }
}