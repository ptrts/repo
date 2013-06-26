package com.suchorukov.tarouts.hello;

import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Pavel
 * Date: 26.06.13
 * Time: 19:12
 */
public class Hello {

    public static void main(String[] args) {

        Random rnd = new Random(22);
        int number = Math.abs(rnd.nextInt()) % 100 + 1;

        for (int i = 0; i < 6; i++) {

            Scanner scanner = new Scanner(System.in);

            if (scanner.hasNextInt()) {
                int answer = scanner.nextInt();
                if (answer == 0) {
                    System.out.println("Досвидания");
                    return;
                } else if (answer == number) {
                    System.out.println("Оно!");
                    return;
                } else if (number > answer) {
                    System.out.println("Нет, оно больше");
                } else {
                    System.out.println("Нет, оно меньше");
                }
            }
        }
        System.out.println("Вы не выиграли");
    }
}
