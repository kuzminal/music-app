package com.kuzmin.util;

public interface Normalizer {
    default String transform(String input) {
        return input.trim();
    }
}
