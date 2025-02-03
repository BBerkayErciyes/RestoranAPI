package com.interview.repository;

import com.interview.domain.Menu;
import com.interview.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;


@Repository
public interface MenuRepository extends CrudRepository<Menu, UUID>{
    List<Menu> findByNameContains(String name);

}
