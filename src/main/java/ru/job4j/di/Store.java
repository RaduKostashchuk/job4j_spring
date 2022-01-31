package ru.job4j.di;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Store {
    private List<String> data = new ArrayList<>();

    public void add(String string) {
        data.add(string);
    }

    public List<String> getAll() {
        return new ArrayList<>(data);
    }
}
