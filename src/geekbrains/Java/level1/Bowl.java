package geekbrains.Java.level1;

public class Bowl {
    /* Создаем переменные, отвечающие за кол-во еды в миске и за максимальное кол-во еды в миске */
    int quantityFood;
    private  int Max_quantityFood;

    /*Дальше создаем конструктор для миски, в котором указываем, что можно задавать переменную кол-ва еды в миске,
    и то, что максимальное кол-во еды в миске равно заданному пользователем изначального кол-ва еды в миске */
    public Bowl (int _quantityFood) {
        this.quantityFood = _quantityFood;
        this.Max_quantityFood = _quantityFood;
    }

    /* Далее создаем метод наполнения миски при ее критическом опустошении - зависит от переменной нужды_в_еде */
    public int fillingBowl (Cat cat) {
        if (quantityFood < cat.need_for_food()) {
            quantityFood = Max_quantityFood;
        }
        return quantityFood;
    }

    public void print_quantityFood () {
        System.out.println ("Кол-во еды: " + quantityFood);
    }
}