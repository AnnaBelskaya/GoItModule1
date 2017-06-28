package goit.education.module1;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Сколько дней осталось до конца лета?");
        int days = Integer.parseInt(s.nextLine());
        if (days==0){
            System.out.println("Лето 2017 закончилось.");
        } else {
            System.out.println("Этим летом я буду:".toUpperCase());
            for (int i = 0; i < days; i++) {
                if (i % 2 == 0) {
                    System.out.printf("\tДень %d. Писать код.\n", i + 1);
                } else {
                    System.out.printf("\tДень %d. Отлаживать код.\n", i + 1);
                }
            }
        }
    }
}
