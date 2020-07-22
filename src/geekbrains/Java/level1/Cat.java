package geekbrains.Java.level1;

import java.util.Random;

/* Сроздаем переменные для Котов. Сытость в момент и Максимальная сытость - скольлько максимум может съесть кот. */

public class Cat {
    private String Name;
    private int fill;
    private int maxFill;
    Random rand = new Random ();

    public Cat (String _Name) {
        this.Name = _Name;
        this.fill = 0;
        this.maxFill = 10;
    }

    /* Метод описывающий нужду в еде */
    public int need_for_food () {
        int need_for_food = maxFill - fill;
        return need_for_food;
    }

    /* Метод описывающий, когда кот/кошка должны есть и при каких условиях и что следует из этого */
    public boolean Cat_eat (Bowl bowl) {
        if (fill < maxFill && need_for_food() <= bowl.quantityFood  ) {
            bowl.quantityFood = bowl.quantityFood - (need_for_food());
            fill = maxFill;
            System.out.println (Name + ": " + true);
            return true;
        } else if (fill == maxFill ){
            System.out.println (Name + " не хочет есть");
            return false;
        } else {
            System.out.println(Name + " не хватило еды. Нужно положить корм.");
            return false;
        }
    }

    /* Здесь я поэксперементировал с изменением потребностью в еде, что бы со временем кот/кошка начинали хотеть есть */
    public int decrease_fill () {
        int diff = maxFill - 1;
        int decrease_fill = rand.nextInt(diff + 1) + 1;
        if (decrease_fill > fill) {
            return fill;
        } else {
            fill = fill - decrease_fill;
        }
        return fill;
    }

    public void print_infoCat () {
        System.out.println(Name + " - сытость: " + fill + " потребность в еде " + (maxFill - fill));
    }

    public void print_Name_Cat () {
        System.out.print (Name);
    }
}
