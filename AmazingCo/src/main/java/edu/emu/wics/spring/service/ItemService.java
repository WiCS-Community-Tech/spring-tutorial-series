package edu.emu.wics.spring.service;

import edu.emu.wics.spring.client.ItemClient;
import edu.emu.wics.spring.dao.ProductDao;
import edu.emu.wics.spring.dto.Item;
import edu.emu.wics.spring.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ItemService {
    private final ItemClient itemClient;
    private final ProductDao productDao;

    @Autowired
    public ItemService(ItemClient itemClient, ProductDao productDao) {
        this.itemClient = itemClient;
        this.productDao = productDao;
    }

    public Product getItem(UUID id) {
        return productDao.getReferenceById(id);
    }

    public Product saveItem(Item item) {
        Product product = new Product(null, item.getName(), item.getDescription());
        return productDao.save(product);
    }
}
