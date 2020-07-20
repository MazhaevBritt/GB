package geekbrains.Java.level1;

public class Main {

    public static void main(String[] args) {

        Animal [] arrPet = new Animal[10];
        arrPet [0] = new Cat ("Крис");
        arrPet [1] = new Cat ("Шейла");
        arrPet [2] = new Cat ("Фокс");
        arrPet [3] = new Cat ("Амурчик");
        arrPet [4] = new Cat ("Пушок");
        arrPet [5] = new Dog ("Жужа");
        arrPet [6] = new Dog ("Ларик");
        arrPet [7] = new Dog ("Рома");
        arrPet [8] = new Dog ("Акелла");
        arrPet [9] = new Dog ("Цербер");

        for (int i = 0; i < arrPet.length; i++) {
            arrPet[i].getInfoPet();
            arrPet[i].run(450);
            arrPet[i].jump(1.5f);
            arrPet[i].swim(15);
            System.out.println ();
            System.out.println ();
        }


    }
}


