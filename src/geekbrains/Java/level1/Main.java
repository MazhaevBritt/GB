package geekbrains.Java.level1;

public class Main {

    public static void main(String[] args) {

        /* создаем миску и наполняем ее */
        Bowl bowl = new Bowl (30);
        bowl.print_quantityFood();
        System.out.println();

        /* Создаем котов */
        Cat array_Cats [] = new Cat [5];
        array_Cats [0] = new Cat ("Крис");
        array_Cats [1] = new Cat ("Шейла");
        array_Cats [2] = new Cat ("Фокс");
        array_Cats [3] = new Cat ("Амурчик");
        array_Cats [4] = new Cat ("Пушок");

        /* Проверяем */
        for (int z = 0; z < 2; z++) {
            for (int i = 0; i < array_Cats.length; i++) {
                if (bowl.quantityFood >= array_Cats[i].need_for_food()) {
                    array_Cats[i].print_infoCat();
                    array_Cats[i].Cat_eat(bowl);
                    bowl.print_quantityFood();
                    array_Cats[i].decrease_fill();
                    System.out.println();
                } else {
                    array_Cats[i].print_infoCat();
                    array_Cats[i].print_Name_Cat();
                    System.out.println(" - не хватило еды. Нужно положить корм.");
                    bowl.fillingBowl(array_Cats[i]);
                    bowl.print_quantityFood();
                    System.out.println();
                }
            }
        }
    }
}


