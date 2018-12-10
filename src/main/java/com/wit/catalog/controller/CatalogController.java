package com.wit.catalog.controller;

import com.wit.catalog.model.Item;
import com.wit.catalog.services.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/catalog-service/")
public class CatalogController {
    @Autowired
    private CatalogService catalogService = new CatalogService();
    @PostMapping("add-item")
    public ResponseEntity addItem(@ModelAttribute Item item){
        return ResponseEntity.ok().body(catalogService.addItem(item));
    }
    @GetMapping("get-items")
    public ResponseEntity getItems() {
        return ResponseEntity.ok().body(catalogService.fetchItems());
    }
    @GetMapping("get-item")
    public ResponseEntity getItem(@RequestParam int id) {
        return ResponseEntity.ok().body(catalogService.fetchItem(id));
    }
}
