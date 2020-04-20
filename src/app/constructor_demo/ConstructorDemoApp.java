package app.constructor_demo;

import app.models.Person;

public class ConstructorDemoApp {
    public static void main(String[] args) { 
        Person person = new Person("Adarsh", "Singh", 21);
        System.out.println(person);    
    }
}


