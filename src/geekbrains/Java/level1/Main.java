package geekbrains.Java.level1;

public class Main {

    public static void main(String[] args) {

        /* Создаем массив сотрудников, с помощью класса Employee */
        Employee arr_employees [] = new Employee [5];
        arr_employees [0] = new Employee ("Екатерина Курочкина", "Менеджер клининга",
                "kurochkina_74@gmail.com", "89995427456", 27000, 46 );
        arr_employees [1] = new Employee ("Кирилл Крейсеров", "Менеджер отдела",
                "kreyserAvrora777@gmail.com", "89625486321", 45000, 30);
        arr_employees [2] = new Employee ("Владимир Ксавьеров", "Специалист-проектировщик",
                "professorX@gmail.com", "89245684242", 38000, 27);
        arr_employees [3] = new Employee ("Варвара Безос", "Финансовый директор",
                "AmazonKa@gmail.com", "89994568198", 78000, 45);
        arr_employees [4] = new Employee ("Кристиан Уэйн", "Глава СБ",
                "gotham_knight@gmail.com", "89999110202", 50000, 37);

        /* С помощью цикла, проходим по всем элементам массива, и определяем (вызывая при этом геттер возраста),
        кто из сотрудников старше 40 лет. Далее при помощи метода getInfoEmployee, из класса Employee,
        выводим информацию о них */
        for (int i = 0; i < arr_employees.length; i++) {
            if (arr_employees [i].getAge() > 40) {
                arr_employees [i].getInfoEmployee();
            }
        }

    }
}


