package com.interview.repository;

import com.interview.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;


@Repository
public interface CategoryRepository extends JpaRepository<Category, UUID> {
    List<Category> findByMenuId(UUID menu_id);
    List<Category> findByNameContains(String name);
}
