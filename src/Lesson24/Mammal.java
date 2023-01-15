package Lesson24;

public abstract class Mammal extends Animal {
    Mammal(String nameMammal) {
        super(nameMammal);
        this.name = nameMammal;
    }
    abstact abstract void run();
}
