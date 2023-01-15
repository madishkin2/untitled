package Lesson24;

public class Mechenosec extends Fish {
    Mechenosec(String nameMechenosec) {
        super();
        name = nameMechenosec;
    }
    @Override
    void swim() {
        System.out.println("Mechenose bysraya ryba, kotoraya bystro plavaet");
    }
    @Override
    public void eat() {
        System.out.println("Mechenosec ne hichnaya ryba i ona est obychnyi rybii korm");
    }
}
