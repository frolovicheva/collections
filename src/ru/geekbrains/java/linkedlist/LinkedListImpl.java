package ru.geekbrains.java.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListImpl {
    public static void main(String[] args) {
        //Создаем
       List<String> linkedList = new LinkedList<>(Arrays.asList ("A","D","E","F"));
       System.out.println (linkedList.getClass ().getSimpleName () + ", " + linkedList);

       //Можно взять часть ЛинкЛиста и сделать новый Список
       List<String> sublist = linkedList.subList (0,3);
       System.out.println (sublist);

       //Добавляем несколько элемкнтов в конец
       linkedList.addAll (Arrays.asList ("G","H","I"));
       System.out.println (linkedList);

       //Добавляем несколько элементов н нужную нам часть
       linkedList.addAll (1,Arrays.asList ("B", "C"));
       System.out.println (linkedList);

       //Удаляем по значению, но он удаляет только первый найденый элемент
       linkedList.remove ("H");
       System.out.println (linkedList);

       //Добавляем элемент по индексу
       linkedList.add ((linkedList.size ()-1),"aitch");
       System.out.println (linkedList);


       //Заменяем элемент по значению
       linkedList.set(linkedList.indexOf ("aitch"),"H");
       System.out.println (linkedList);

        //Добавляем элемент в конец
        linkedList.add ("J");
        System.out.println (linkedList + ", элементов - " + linkedList.size ());
    }
}









