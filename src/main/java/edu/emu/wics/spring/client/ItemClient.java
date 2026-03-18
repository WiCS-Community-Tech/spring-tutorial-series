package edu.emu.wics.spring.client;

import edu.emu.wics.spring.dto.Item;

public class ItemClient {

    public Item getItem(int id) {
        return new Item(id,
                "Item Name",
                "Item Description");
    }

    public Item saveItem(Item item) {
        return item;
    }
}
