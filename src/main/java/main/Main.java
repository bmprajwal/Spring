package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot x = new Parrot();
        x.setName("Kiki");

        Parrot y = new Parrot();
        y.setName("Miki");

        Supplier<Parrot> parrotSupplier1 = () -> x;
        context.registerBean("parrot1", Parrot.class, parrotSupplier1);

        Supplier<Parrot> parrotSupplier2 = () -> y;
        context.registerBean("parrot2", Parrot.class, parrotSupplier2, bd -> bd.setPrimary(true));

        Parrot p = context.getBean(Parrot.class);
        System.out.println(p);
        System.out.println(p.getName());
    }
}
