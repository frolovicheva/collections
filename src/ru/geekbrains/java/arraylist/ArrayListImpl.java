package ru.geekbrains.java.arraylist;

import java.util.*;

public class ArrayListImpl {
    public static void main(String[] args) {
        //Разные способы создания ArrayList
        List<Integer> listClassic = new ArrayList<> (Arrays.asList (1,2,3,4));
        List<Integer> listClassic2 = Arrays.asList (5,6);
        Integer[] arr = {5,6,7};
        List<Integer> listFromArr = Arrays.asList (arr);

        //добавили содержимое массива в ArrayList
        Collections.addAll (listClassic,arr);
        System.out.println (listClassic.getClass ().getSimpleName () + listClassic);

        //Not ArrayList, unmodifiable.
        List<Integer> listSince11thJava = List.of (1,2,3,4); // Elements cannot be added, removed, or replaced. Calling any mutator method on the List will always cause UnsupportedOperationException to be thrown.
        System.out.println (listSince11thJava.getClass ().getSimpleName());// результат - List

        //Интересные методы ArrayList
        ArrayList<Integer> listWithCapacity = new ArrayList<> (20);//Пустой ArrayList с заданной емкостью

        listWithCapacity.addAll (listClassic); // Скопировали в него элементы из другого Листа
        showElementsInArrayList (listWithCapacity);

        listWithCapacity.removeAll (listClassic2);// Удалили часть элементов
        showElementsInArrayList (listWithCapacity);

        listWithCapacity.addAll (4, Arrays.asList (500,600));// Добавили элементы по индексу
        showElementsInArrayList (listWithCapacity);

        listWithCapacity.set (6,700); //Поменяли значение по индексу
        showElementsInArrayList (listWithCapacity);

        listWithCapacity.add (0,0);
        showElementsInArrayList (listWithCapacity);//Добавили элемент в начало

        listWithCapacity.trimToSize ();// Уменьшили емкость до количества элементов

        Integer[] arrNew = new Integer[listWithCapacity.size ()]; //Можно преобразовать ArrayList в обычный массив
        listWithCapacity.toArray (arrNew);
        System.out.println (arrNew[7]);


    }

    public static void showElementsInArrayList(ArrayList <Integer> arr) {
        System.out.println (arr + ", " + arr.size () + "- elemets in this ArrayList");
    }
}
