package geekbrains.Java.level1;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println ("Здравствуйте. Пожалуйста, введите ваше имя:");
        Scanner sc = new Scanner (System.in);
        String userName = sc.nextLine ();

        /* 1. Написать программу, которая загадывает случайное число от 0 до 9.
        Пользователю дается 3 попытки угадать это число.
        При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
        После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).*/

        get_Greeting (userName);

        while (true) {
            randomNumberGame(userName);
            System.out.println ();
            System.out.println ("Хотите попробывать еще раз?");
            int userChoise = sc.nextInt ();
            if (userChoise == 0) {
                System.out.println ("До свидания, " + userName + ".");
                break;
            }
        }

        /* 2* Создать массив из слов. При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
        сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь.
        Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
        Играем до тех пор, пока игрок не отгадает слово.
        Используем только маленькие буквы*/

        String [] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        get_Instructions (userName);

        printArray (words);

        get_Comparison_Words (words, userName);

    }

    public static void get_Greeting (String userName) {
        System.out.println ();
        System.out.println (userName + ", добро подаловать в игру угадай число! Правила просты:");
        System.out.println ("Вам будет загадано число, в промежутке от 0 до 9. Вы должны угадать его.");
        System.out.println ("На это вам будет дано всего 3 попытки.");
        System.out.println ("Если вам понятны правила, тогда приступим!");
        System.out.println ();
    }

    public static void randomNumberGame (String userName) {

        Random rand = new Random ();
        int randomNumber = rand.nextInt (10);
        //System.out.println (randomNumber);

        System.out.println (userName + ", введите загаданное число:");
        Scanner sc = new Scanner (System.in);

        int i = 0;
        for (; i < 3; i++) {
            int userAnswer = sc.nextInt ();
            if (userAnswer == randomNumber) {
                System.out.println ("Поздравляю вас " + userName + "! Вы верно угадали число!");
                break;
            } else if (userAnswer < randomNumber && userAnswer >= 0) {
                System.out.println (userName + ", вы ошиблись. Ваше число меньше загаданного. Поробуйте еще раз.");
            } else if (userAnswer > randomNumber && userAnswer <= 9) {
                System.out.println (userName + ", вы ошиблись. Ваше число больше загаданного. Попробуйте еще раз.");
            } else {
                System.out.println (userName + ", вас просили вводить только числа от 0 до 9. Повторите ввод.");
            }
        }
        if (i == 3) {
            System.out.println ("Вы проиграли.");
        }
    }

    public static void get_Instructions (String userName) {
        System.out.println (userName + ", сейчас вам выведеться список слов. Ваша задача угадать загаданное слово из этого списка.");
        System.out.println ("Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.");
        System.out.println ("Играем до тех пор, пока вы не отгадаете слово");
        System.out.println ("И так, поехали!");
        System.out.println ();
    }

    public static void printArray (String [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            System.out.println ();
        }
        System.out.println();
    }

    public  static void get_Comparison_Words (String [] words, String userName) {

        Random rand = new Random ();
        int randomWord = rand.nextInt (25);

        String hiddenWord = words [randomWord];
        /*System.out.println (hiddenWord);*/
        String str1 = hiddenWord;

        int check = 0;
        while (check != str1.length()) {

            Scanner word = new Scanner (System.in);
            System.out.println ("Введите слово:");
            String userWord = word.nextLine();
            String str2 = userWord;

            for (int i = 0; i < str1.length (); i++) {
                if (str1.charAt(i) == str2.charAt(i)) {
                    System.out.print(str1.charAt(i));
                    check++;
                } else {
                    System.out.print ("###############");
                    System.out.println();
                    System.out.println ("Попробуйте еще раз.");
                    break;
                }
            }
        }
        System.out.println();
        System.out.println ("Поздравляю! Вы отгадали слово!");
    }
}
