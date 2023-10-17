package Seminar1;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(sum(1, Integer.MAX_VALUE));
    }

    public static int sum(int a, int b) {
        assert Integer.MAX_VALUE - Math.abs( a ) >= Math.abs( b ) : "Вышли за пределы целых чисел";
        return a + b;
    }
}
