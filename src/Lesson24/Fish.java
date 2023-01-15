package Lesson24;

public abstract class Fish extends Animal {
    Fish (String s) {
        super();
        name = s;
        }
    public void sleep() {
        System.out.println("Vsegda interesno nablyudat kak spyat ryby");
    }
    abstract void swim();
}
