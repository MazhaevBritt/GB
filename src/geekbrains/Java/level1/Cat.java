package geekbrains.Java.level1;

public class Cat extends Animal {


    public Cat (String Name) {

        super(Name, 200, 500, 0, 10, 10, 20);

    }

    @Override
    public boolean swim (int distance) {
        System.out.print ("Тут коты не плавают");
        return false;
    }
}
