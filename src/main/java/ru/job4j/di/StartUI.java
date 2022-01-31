package ru.job4j.di;

public class StartUI {
    private Store store;
    private ConsoleInput consoleInput;

    public StartUI(Store store, ConsoleInput consoleInput) {
        this.store = store;
        this.consoleInput = consoleInput;
    }

    public void add(String string) {
        store.add(string);
    }

    public void print() {
        for (String string : store.getAll()) {
            System.out.println(string);
        }
    }
}