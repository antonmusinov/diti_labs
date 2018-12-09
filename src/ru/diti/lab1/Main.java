package ru.diti.lab1;

import ru.diti.lab1.menu.Menu;
import ru.diti.lab1.menu.impl.MenuImpl;

public class Main {
    public static void main(String[] args) {
        Menu menu = new MenuImpl();

        menu.menu();
    }
}
