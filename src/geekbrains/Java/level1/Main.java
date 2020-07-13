package geekbrains.Java.level1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    /* Константы для массива игрового поля, его размера и условия победы*/
    public static char [] [] gameMap;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;
    /* Константы обозначений игрового поля*/
    public static final char DOT_EMPTY = '.'; /* Пустая ячейка игрового поля */
    public static final char DOT_X = 'X'; /* Обозначение "крестика" */
    public static final char DOT_O = 'O'; /* Обозначение "нолика" */
    public static Scanner sc = new Scanner(System.in); /* инициализация ввода пользователя */
    public static Random rand = new Random(); /* инициализация рандома */

    public static void main(String[] args) {
        initGameMap();
        printGameMap();
        while (true) {
            playerTurn();
            printGameMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            computerTurn();
            printGameMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");

    }
    /* Инициализация игрового поля */
    public static void initGameMap () {
        gameMap = new char [SIZE][SIZE];
        for (int i = 0; i < SIZE; i++ ) {
            for (int j = 0; j < SIZE; j++) {
                gameMap [i] [j] = DOT_EMPTY;
            }
        }
    }
    /* Вывод игрового поля, с использованием инициализированного массива */
    public  static void printGameMap () {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        } /* Вывод "верхних" координат игрового поля */
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(gameMap[i][j] + " ");
            } /* Вывод пустых ячеек игрового поля, для каждого ряда массива */
            System.out.println();
        } /* Вывод "боковых" координат игрового поля */
        System.out.println();

    }
    /* Метод, описывающий ход ИГРОКА, с учетом того, что Игрок вводит координаты больше индексов массива на 1 */
    public static void playerTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y)); /* Цикл работает до тех пор, пока ИГРОК выбирает путые координаты, и которые относятся к индексам массива. */
        gameMap[y][x] = DOT_X;
    }
    /* Сообственно осуществляем проверку - можно поставить "крестик" или нет */
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (gameMap[y][x] == DOT_EMPTY) return true;
        return false;
    }
    /* Метод, описывающий ход компьютера */
    public static void computerTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE); /* Выбор рандомной координаты x , из диапозона SIZE */
            y = rand.nextInt(SIZE); /* Выбор рандомной координаты y , из диапозона SIZE */
        } while (!isCellValid(x, y)); /* Осуществление проверки, возможно ли походить по данным координатам */
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        gameMap[y][x] = DOT_O;
    }
    /* Проверка условий победы */
    public static boolean checkWin (char symb) {
        for (int i = 0; i < 3; i++)
            if ((gameMap[i][0] == symb && gameMap[i][1] == symb &&
                    gameMap[i][2] == symb) ||
                    (gameMap[0][i] == symb && gameMap[1][i] == symb &&
                            gameMap[2][i] == symb))
                return true;
        if ((gameMap[0][0] == symb && gameMap[1][1] == symb &&
                gameMap[2][2] == symb) ||
                (gameMap[2][0] == symb && gameMap[1][1] == symb &&
                        gameMap[0][2] == symb))
            return true;
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (gameMap[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

}
