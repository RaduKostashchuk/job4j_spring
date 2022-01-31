package ru.job4j.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StartUI {
    @Autowired
    private Store store;
    @Autowired
    private ConsoleInput consoleInput;

    public void add(String string) {
        store.add(string);
    }

    public void print() {
        for (String string : store.getAll()) {
            System.out.println(string);
        }
    }
}
