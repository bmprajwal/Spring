package main;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


public class Parrot {
    private String name;

    public Parrot(){
        System.out.println("Parrot Created");
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot: " + this.name;
    }
}
