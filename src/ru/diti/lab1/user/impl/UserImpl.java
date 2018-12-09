package ru.diti.lab1.user.impl;

import ru.diti.lab1.user.User;

import java.util.Scanner;

public class UserImpl implements User {
    @Override
    public int userInputElementMenu () {

        Scanner in = new Scanner(System.in);
        System.out.println("Input element menu: ");

        return in.nextInt();
    }
}
