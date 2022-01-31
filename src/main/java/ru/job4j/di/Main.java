package ru.job4j.di;

public class Main {
    public static void main(String[] args) {
        Context con = new Context();
        con.reg(ConsoleInput.class);
        con.reg(Store.class);
        con.reg(StartUI.class);

        StartUI startUI = con.get(StartUI.class);

        startUI.add("test record");
        startUI.print();
    }
}
