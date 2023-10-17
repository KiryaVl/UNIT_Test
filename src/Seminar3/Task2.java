package Seminar3;

/*
Разработайте тесты для метода firstLast6,
 где на вход подается массив чисел, а метод возвращает true, если первое или последнее число в массиве равно 6, иначе false.
 */
public class Task2 {
    public static boolean firstLast6(int[] array) {
        return (array[0] == 6 || array[array.length - 1] == 6);
    }
}
