package Lesson24;

public abstract class Animal {
    String name;
    Animal(String animalName) {
        name = animalName;
    }
    abstract public void eat();
    abstract public void sleep();



}
