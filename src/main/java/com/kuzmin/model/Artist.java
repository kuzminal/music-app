package com.kuzmin.model;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Artist {
    private String name;
    private Map<String, Song> songs=new HashMap<>();

    public Artist(String name) {
        this.name = name;
    }
}
