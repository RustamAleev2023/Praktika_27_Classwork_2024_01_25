import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
        task4();
    }
    //Задание 1
    //Пользователь вводит с клавиатуры в строку набор
    //символов от 0-9.
    //Необходимо преобразовать строку в число целого типа.
    //Предусмотреть случай выхода за границы диапазона, опре-
    //деляемого типом int. Используйте механизм исключений.
    public static void task1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку из цифр 0-9");
        try {
            int number = scanner.nextInt();
            System.out.println(number);
        } catch (InputMismatchException e){
            System.out.println("Вы вышли за пределы int");
        }
    }

    //Задание 2
    //Пользователь вводит с клавиатуры в строку набор 0
    //и 1. Необходимо преобразовать строку в число целого
    //типа в десятичном представлении. Предусмотреть случай
    //выхода за границы диапазона, определяемого типом int,
    //неправильный ввод. Используйте механизм исключений.
    public static void task2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку из 0 и 1");
        try {
            System.out.println(Integer.parseInt(scanner.nextLine(), 2));
        } catch (NumberFormatException e){
            System.out.println("Вы вышли за пределы int");
        }
    }

    //Задание 3
    //Для класса Array из предыдущих заданий добавьте
    //механизм работы с исключениями, где это необходимо
    public static void task3(){

    }

    //Задание 4
    //Пользователь вводит в строку с клавиатуры матема-
    //тическое выражение. Например, 3+8+10+11. Программа
    //должна посчитать результат введенного выражения.
    //В строке могут быть только целые числа и оператор +
    //(в унарном и бинарном виде).
    //ввода используйте механизм исключений.
    public static void task4(){
        try {
            Scanner scanner = new Scanner(System.in);
            String string = scanner.next();
            String[] strings = string.split("\\+");
            int[] numbers = new int[strings.length];
            int sum = 0;
            for (int i = 0; i < strings.length; i++) {
                numbers[i] = Integer.parseInt(strings[i]);
                if(numbers[i] > 99 || numbers[i] < 0){
                    throw new IllegalArgumentException();
                }
                sum += numbers[i];
            }
            System.out.println("Sum = " + sum);
        } catch (NumberFormatException e){
            System.out.println("Неправильный формат");
        } catch (IllegalArgumentException e){
            System.out.println("Числа могут быть унарные и бинарные");
        }

    }
}