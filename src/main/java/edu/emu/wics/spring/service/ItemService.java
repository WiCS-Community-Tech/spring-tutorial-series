package edu.emu.wics.spring.service;

import edu.emu.wics.spring.client.ItemClient;
import edu.emu.wics.spring.dto.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    private final ItemClient itemClient;

    @Autowired
    public ItemService(ItemClient itemClient) {
        this.itemClient = itemClient;
    }

    public String getItem(int id) {
        Item item = itemClient.getItem(id);

        return item.getName();
    }

    public Item saveItem(Item item) {
        return itemClient.saveItem(item);
    }
}
