package com.kuzmin.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Song implements Comparable<Song> {
    private String name;
    private int votes=0;

    public Song(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Song o) {
        int value = Integer.compare(o.getVotes(), getVotes());
        if (value == 0) {
            value = getName().compareTo(o.getName());
        }
        return value;
    }
}
