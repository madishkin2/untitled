package Lesson24;

public class Pingvin extends Bird {
    Pingvin (String nameBird) {
        super();
        name = nameBird;
    }
    @Override
    public void eat() {
        System.out.println("Pingvin lyubit est rybu");
    }
    @override
    public void sleep() {
        System.out.println("Pingviny spyat drug s drugom");
    }



}
