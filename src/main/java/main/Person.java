package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Harvey";

    private Parrot parrot;


    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }

    // not recommended
    @Autowired
    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }
}
