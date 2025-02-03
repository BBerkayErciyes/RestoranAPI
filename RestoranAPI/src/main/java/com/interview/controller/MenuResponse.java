package com.interview.controller;

import com.interview.domain.Menu;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Data
public class MenuResponse {

    private UUID id;
    private String name;

    public MenuResponse(Menu menu) {
        this.id = menu.getId();
        this.name = menu.getName();
    }
}
