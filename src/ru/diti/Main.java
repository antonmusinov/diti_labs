package ru.diti;

import ru.diti.lab1.menu.Menu;
import ru.diti.lab1.menu.impl.MenuImpl;
import ru.diti.lab2.menu.MenuLab2Impl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new MenuImpl();
        MenuLab2 m2 = new MenuLab2Impl();

        System.out.println("Выберете ЛР номер 1 или 2");
        Scanner in = new Scanner(System.in);
        int choiceLabsUser = in.nextInt();
        if (choiceLabsUser == 1) {
            menu.menu();
        } else if (choiceLabsUser == 2) {
            //todo
        } else {
            System.out.println("Error");
        }
    }
}
