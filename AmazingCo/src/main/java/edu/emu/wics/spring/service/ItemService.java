package edu.emu.wics.spring.service;

import edu.emu.wics.spring.client.ItemClient;
import edu.emu.wics.spring.dao.ItemRepository;
import edu.emu.wics.spring.dto.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    private final ItemClient itemClient;
    private final ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemClient itemClient, ItemRepository itemRepository) {
        this.itemClient = itemClient;
        this.itemRepository = itemRepository;

    }

    public String getItem(int id) {
        return itemRepository.findById(id).map(Item::getName).orElse("Item not found");
    }

    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }
}
