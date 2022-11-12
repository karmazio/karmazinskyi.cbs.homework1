package org.example;


import org.example.entity.Knight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Knight pablo = context.getBean("pablo", Knight.class);
        pablo.doQuest();

        Knight juan = context.getBean("juan", Knight.class);
        juan.doQuest();
    }
}
