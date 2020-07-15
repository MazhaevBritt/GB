package geekbrains.Java.level1;

import javax.naming.Name;
import java.util.jar.Attributes;

/* Создаем переменные для класса Employee */
public class Employee {
    private String Name;
    private String position;
    private String e_mail;
    private String telephoneNumber;
    private int salary;
    private int age;

    /* Создаем конструктор (параметризированный) */
    public Employee (String _Name, String _position, String _e_mail, String _telephoneNumber, int _salary, int _age) {
        this.Name = _Name;
        this.position = _position;
        this.e_mail = _e_mail;
        this.telephoneNumber = _telephoneNumber;
        this.salary = _salary;
        this.age = _age;

    }

    /* Объявляем метод, который выводит информацию о сотруднике в консоль */
    public void getInfoEmployee () {
        System.out.println(Name + " - " + age + " лет");
        System.out.println("Должность: " + position + ". Зарплата -  " + salary + " руб.");
        System.out.println("Контактные данные: " + telephoneNumber + ", " + e_mail);
        System.out.println();
    }

    /* Создаем геттер, который узнает содержимое поля age */
    int getAge () {
        return age;
    }
}
