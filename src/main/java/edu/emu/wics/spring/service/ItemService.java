package edu.emu.wics.spring.service;

import edu.emu.wics.spring.client.ItemClient;
import edu.emu.wics.spring.dto.Item;

public class ItemService {
    private final ItemClient itemClient = new ItemClient();

    public String getItem(int id) {
        Item item = itemClient.getItem(id);

        return item.getName();
    }

    public Item saveItem(Item item) {
        return itemClient.saveItem(item);
    }
}
