package com.javarush.test.level06.lesson11.home02;

import java.util.ArrayList;
import java.util.List;

/* Статические коты
1. В классе Cat добавь public статическую переменную cats (ArrayList<Cat>).
2. Пусть при каждом создании кота (нового объекта Cat) в переменную cats добавляется этот новый кот. Создать 10 объектов Cat.
3. Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.
*/

public class Cat {
    public Cat(){
        cats.add(this);
    }
    public static ArrayList<Cat> cats = new ArrayList<>();
    //add your code here - добавь свой код тут

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
           Cat cat = new Cat();
        }
        //Create 10 Cat-s here - создай 10 котов тут
        printCats();
    }

    public static void printCats() {

        for (Cat elem: cats) {
            System.out.println(elem);
        }

        //add your step 3 code here - добавь свой код для пункта 3 тут
    }
}