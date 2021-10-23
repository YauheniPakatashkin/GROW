import java.sql.SQLOutput;

public class Block1 {
    public static void main(String[] args) {
        task1(3, 3, 3);
        task2(2, 4, 4);

    }

    public static double task1(double a, double b, double c) {
        //Найти значение функции z = ((a-3)*b/2)+c
        return ((a - 3) * b / 2) + c;
    }

    public static double task2(double a, double b, double c) {
        //Вычислить значение выражения
        return ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)) - (Math.pow(a, 3) * c - Math.pow(b, -2));

    }

}
