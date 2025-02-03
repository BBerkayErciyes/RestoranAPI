package com.interview.repository;

import com.interview.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProductRepository extends CrudRepository<Product, UUID> {
    List<Product> findByCategoryId(UUID category_id);
    List<Product> findByNameContains(String name);

}
