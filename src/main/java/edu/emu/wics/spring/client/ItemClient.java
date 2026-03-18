package edu.emu.wics.spring.client;

import edu.emu.wics.spring.dto.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ItemClient {
    private final RestTemplate restTemplate;
    // running on localhost:8081
    // see http://localhost:8081/swagger-ui/index.html for deets

    @Autowired
    public ItemClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Item getItem(int id) {
        return restTemplate.getForObject("http://localhost:8081/item/"+id, Item.class);
    }

    public Item saveItem(Item item) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Item> request = new HttpEntity<>(item, headers);

        return restTemplate.postForObject(
                "http://localhost:8081/item", request, Item.class);
    }
}
