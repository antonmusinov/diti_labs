package ru.diti.lab1.menu.impl;

import ru.diti.lab1.arrays.ArraysCreateAndManipulation;
import ru.diti.lab1.arrays.impl.ArraysCreateAndManipulationImpl;
import ru.diti.lab1.menu.Menu;
import ru.diti.lab1.user.User;
import ru.diti.lab1.user.impl.UserImpl;

import java.util.stream.Stream;

public class MenuImpl implements Menu {

    private ArraysCreateAndManipulation arraysCreateAndManipulation = new ArraysCreateAndManipulationImpl();

    @Override
    public void menu() {
        System.out.println("МЕНЮ");
        textMenu();
        System.out.println("Выбор элемента меню");
        elementMenu();
    }

    @Override
    public void textMenu() {
        Stream.Builder<String> textMenu = Stream.<String>builder();
        textMenu
                .add("1. Создание массива")
                .add("2. Вывод массива")
                .add("3. Вставка элемента в начало массива")
                .add("4. Включение элемента в середину(после i-го элемента)")
                .add("5. Включение элемента в конец массива")
                .add("6. Включение элемента в середину(перед i-ым элементом)")
                .add("7. Удаление элемента из середины(i-го элемента)")
                .add("8. Удаление элемента из начала массива")
                .add("9. Удаление элемента из конца массива")
                .add("10. Подсчет суммы элементов массива")
                .add("11. Создание копии массива")
                .add("12. Сортировка линейного массива")
                .add("13. Закрытие программы")
                    .build().forEach(System.out::println);
    }


    private void elementMenu() {
        User userInputElementMenu = new UserImpl();

        int userElementMenu = userInputElementMenu.userInputElementMenu();

        switch (userElementMenu) {
            case 1 :
                System.out.println("1. Создание массива");
                arraysCreateAndManipulation.createArrayUser();
                menu();
                break;
            case 2 :
                System.out.println("2. Вывод массива");
                arraysCreateAndManipulation.outputArray();
                menu();
                break;
            case 3 :
                System.out.println("3. Вставка элемента в начало массива");
                arraysCreateAndManipulation.arrayFirstElementInput();
                menu();
                break;
            case 4 :
                System.out.println("4. Включение элемента в середину(после i-го элемента)");
                //todo coming soon
                break;
            case 5 :
                System.out.println("5. Включение элемента в конец массива");
                arraysCreateAndManipulation.arrayLastElementInput();
                menu();
                break;
            case 6 :
                System.out.println("6. Включение элемента в середину(перед i-ым элементом)");
                break;
            case 7 :
                System.out.println("7. Удаление элемента из середины(i-го элемента)");
                break;
            case 8 :
                System.out.println("8. Удаление элемента из начала массива");
                break;
            case 9 :
                System.out.println("9. Удаление элемента из конца массива");
                break;
            case 10 :
                System.out.println("10. Подсчет суммы элементов массива");
                arraysCreateAndManipulation.sumArrayUser();
                menu();
                break;
            case 11 :
                System.out.println("11. Создание копии массива");
                arraysCreateAndManipulation.copyArrayUser();
                menu();
                break;
            case 12 :
                System.out.println("12. Сортировка линейного массива");
                arraysCreateAndManipulation.sortArrayUser();
                break;
            case 13 :
                System.out.println("13. Закрытие программы");
                break;
            default:
                System.out.println("Error");
                menu();
                break;
        }

    }


}
