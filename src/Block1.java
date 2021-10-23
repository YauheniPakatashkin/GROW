import java.sql.SQLOutput;

public class Block1 {
    public static void main(String[] args) {
        task1(3, 3, 3);
        task2(2, 4, 4);
        task3(3, 4);

    }

    public static double task1(double a, double b, double c) {
        //Найти значение функции z = ((a-3)*b/2)+c
        return ((a - 3) * b / 2) + c;
    }

    public static double task2(double a, double b, double c) {
        //Вычислить значение выражения
        return ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)) - (Math.pow(a, 3) * c - Math.pow(b, -2));

    }

    public static double task3(double x, double y) {
        //Вычислить значение выражения
        return ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) + Math.tan(x * y);
    }

    public static void task4(double a) {
        //Дано действительное число R вида nnn.ddd(три цифровых разряда в дробной и целой частях). Поменять местами
        //дробную и целую части числа и вывести полученное значение числа.
    }


}
