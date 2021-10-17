import java.sql.SQLOutput;

public class Block1 {
    public static void main(String[] args) {
        task1(3,3,3);
    }
    public static double task1(double a, double b, double c){
      //Найти значение функции z = ((a-3)*b/2)+c
       double z = ((a-3)*b/2)+c;
        System.out.println(z);
        return z;
    }

}
