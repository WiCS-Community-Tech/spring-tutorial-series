package edu.emu.wics.spring.controller;

import edu.emu.wics.spring.dto.Item;
import edu.emu.wics.spring.dto.Product;
import edu.emu.wics.spring.service.ItemService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class ItemController {
    private final ItemService itemService ;

    public ItemController(@Autowired ItemService itemService) {
      this.itemService=itemService;
    }

    @GetMapping("/item/{id}")
    public Product getItem(@PathVariable UUID id) {
        return itemService.getItem(id);
    }

    @PostMapping("/item")
    public Product saveItem(@Valid @RequestBody Item item) {
        return itemService.saveItem(item);
    }
}

