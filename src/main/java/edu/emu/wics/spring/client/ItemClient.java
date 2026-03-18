package edu.emu.wics.spring.client;

import edu.emu.wics.spring.dto.Item;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

public class ItemClient {
    // running on localhost:8081
    // see http://localhost:8081/swagger-ui/index.html for deets

    public Item getItem(int id) {
        return new Item(id,
                "Item Name",
                "Item Description");
    }

    public Item saveItem(Item item) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Item> request = new HttpEntity<>(item, headers);

        return item;
    }
}
