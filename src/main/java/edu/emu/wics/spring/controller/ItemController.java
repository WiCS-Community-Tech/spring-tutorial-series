package edu.emu.wics.spring.controller;

import edu.emu.wics.spring.dto.Item;
import edu.emu.wics.spring.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/item")
    public String getItem() {
        int id = 0;
        return itemService.getItem(id);
    }

    @PostMapping("/item")
    public Item saveItem(Item item) {
        return itemService.saveItem(item);
    }
}

