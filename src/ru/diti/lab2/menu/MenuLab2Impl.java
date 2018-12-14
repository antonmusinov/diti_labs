package ru.diti.lab2.menu;

import ru.diti.lab1.menu.Menu;

import java.util.stream.Stream;

public class MenuLab2Impl implements Menu {
    @Override
    public void menu() {
        System.out.println("МЕНЮ");
        textMenu();
        System.out.println("Выбор элемента меню");
        elementMenuSecondLab();
    }

    @Override
    public void textMenu() {
        Stream.Builder<String> textMenu = Stream.<String>builder();
        textMenu
                .add("1. Построение линейного списка.")
                .add("2. Печать списка.")
                .add("3. Вставка элемента в начало списка.")
                .add("4. Включение элемента в середину (после i-го элемента).")
                .add("5. Включение элемента в конец списка.")
                .add("6. Включение элемента в середину (перед i-ым элементом).")
                .add("7. Удаление элемента из середины (i-го элемента).")
                .add("8. Удаление элемента из начала списка.")
                .add("9. Удаление элемента из конца списка.")
                .add("10. Подсчет числа элементов списка.")
                .add("11. Создание копии списка.")
                .add("12. Сортировка линейного списка.")
                .add("13. Закрытие программы")
                .build().forEach(System.out::println);
    }

    private void elementMenuSecondLab() {
    }
}
