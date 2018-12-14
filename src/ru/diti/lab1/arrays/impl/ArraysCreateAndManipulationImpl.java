package ru.diti.lab1.arrays.impl;

import ru.diti.lab1.arrays.ArraysCreateAndManipulation;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ArraysCreateAndManipulationImpl implements ArraysCreateAndManipulation {

    private int[] arrayUser;
    private int[] arrayNewUser;

    @Override
    public void createArrayUser() {
        System.out.println("Введите кол-во элементов массива");
        arrayCreate();
    }

    @Override
    public void outputArray(){
        System.out.println(Arrays.toString(arrayUser));
    }

    private void  arrayCreate(){
        Scanner in = new Scanner(System.in);
        int numberArraye = in.nextInt();

        arrayUser = new int[numberArraye];

        for(int i = 0; i < arrayUser.length; i++){
            System.out.println("input");
            int numberElementInArray = in.nextInt();
            arrayUser[i] = numberElementInArray;
        }
    }

    @Override
    public void arrayFirstElementInput(){
        if (arrayUser == null) {
            arrayCreate();
        }
        Scanner in = new Scanner(System.in);
        int firstNumberElementArrayUser = in.nextInt();

        for(int i = arrayUser.length-1; i > 0; --i) {
            arrayUser[i] = arrayUser[i-1];
        }

        arrayUser[0] = firstNumberElementArrayUser;
        System.out.println(Arrays.toString(arrayUser));
    }

    @Override
    public void arrayLastElementInput() {
        Scanner in = new Scanner(System.in);
        int lastNumberElementArrayUser = in.nextInt();

        arrayNewUser = new int[arrayUser.length];
        //todo
        arrayNewUser[0] = lastNumberElementArrayUser;
        System.out.println(Arrays.toString(arrayNewUser));
    }

    @Override
    public void sortArrayUser() {
        Arrays.sort(arrayUser);
        System.out.println(Arrays.toString(arrayUser));
    }

    @Override
    public void copyArrayUser() {
        arrayNewUser = Arrays.copyOf(arrayUser, arrayUser.length);
        System.out.println("Array User" + Arrays.toString(arrayUser));
        System.out.println("Copy User Array" + Arrays.toString(arrayNewUser));
    }

    @Override
    public void sumArrayUser() {
        int sumArray = IntStream.range(0 , arrayUser.length + 1).sum();
        System.out.println(Arrays.toString(arrayUser));
        System.out.println("Сумма элементов массива: " + sumArray);
    }
}
