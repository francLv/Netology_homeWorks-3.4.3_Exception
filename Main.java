// package ru.netology;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите url адрес: \n>> ");
        try (Scanner scanner = new Scanner(System.in)) {
            String url = scanner.nextLine();
            UrlUtil.validate(url);
            System.out.print("Введенный url корректен");
        } catch (Exception err) {
            System.out.print("Введенный url некорректен");
        }
    }
}
