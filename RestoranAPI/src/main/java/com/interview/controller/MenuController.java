package com.interview.controller;

import com.interview.domain.Category;
import com.interview.domain.Menu;
import com.interview.service.MenuService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Data
@RestController
@RequestMapping("/api/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @PostMapping("/insert")
    public Menu insert(@RequestBody Menu entity) {
        return menuService.insert(entity);
    }
    @PostMapping("/update")
    public Menu update(@RequestBody Menu entity) {
        return menuService.update(entity);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable UUID id) {
        menuService.deleteById(id);
    }
    @GetMapping("/getall")
    public List<Menu> getAll() {
        return menuService.getAll();
    }
    @GetMapping(path="/getbyid/{id}")
    public Menu getById(@PathVariable(value="id") UUID id) {
        return menuService.getById(id);
    }
    @GetMapping("/search/{name}")
    public List<Menu> search(@PathVariable String name) {
        return menuService.search(name);
    }
}
