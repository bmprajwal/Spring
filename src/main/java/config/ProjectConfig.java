package config;

import main.Parrot;
import main.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {
    @Bean
    public Parrot parrot1(){
        Parrot p = new Parrot();
        p.setName("Louis");
        return p;
    }

    @Bean
    public Parrot parrot2(){
        Parrot p = new Parrot();
        p.setName("Litt");
        return p;
    }

    @Bean
    public Person person(@Qualifier("parrot1") Parrot parrot){
        Person p = new Person();
        p.setName("Harvey");
        p.setParrot(parrot);
        return p;
    }
}
