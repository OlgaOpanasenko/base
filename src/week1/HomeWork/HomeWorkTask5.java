package week1.HomeWork;

import java.util.Scanner;
/**
 * Created by User on 027 27.01.17.
 */
public class HomeWorkTask5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число a");
        int a = scanner.nextInt ();

        System.out.println("Введите число b");
        int b = scanner.nextInt ();

        if (a >= b){
            System.out.println (a-b);
        }else if (b >= a){
            System.out.println (a+b);
        }

    }
}
