package edu.emu.wics.spring.dao;

import edu.emu.wics.spring.dto.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductDao extends JpaRepository<Product, UUID> {
}
