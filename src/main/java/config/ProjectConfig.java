package config;

import main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean
    public Parrot parrot1(){
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    public Parrot parrot2(){
        Parrot p = new Parrot();
        p.setName("Miki");
        return p;
    }

    @Bean (name = "Filo")
    @Primary
    public Parrot parrot3(){
        Parrot p = new Parrot();
        p.setName("Filo");
        return p;
    }

    @Bean
    public String hello(){
        return "Hello";
    }

    @Bean
    public Integer ten(){
        return 10;
    }
}
