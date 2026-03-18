package edu.emu.wics.spring.service;

import edu.emu.wics.spring.client.ItemClient;
import edu.emu.wics.spring.dto.Item;

public class ItemService {

    public String getItem(int id) {
        ItemClient itemClient = new ItemClient();

        Item item = itemClient.getItem(id);

        return item.getName();
    }

    public Item saveItem(Item item) {
        ItemClient itemClient = new ItemClient();

        return itemClient.saveItem(item);
    }
}
