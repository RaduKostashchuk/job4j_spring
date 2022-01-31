package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.job4j.di");
        context.refresh();
        StartUI startUI1 = context.getBean(StartUI.class);
        startUI1.add("Spring DI #1");
        StartUI startUI2 = context.getBean(StartUI.class);
        startUI2.add("Spring DI #2");
        startUI2.print();
    }
}
