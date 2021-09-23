package ru.mirea.task5.Dish;

import ru.mirea.task5.Dish.Cup;
import ru.mirea.task5.Dish.Fork;
import ru.mirea.task5.Dish.Plate;

import java.lang.*;

public class TestDish {
    public static void main(String[] args){
        Fork t1 = new Fork("Denis", 4);
        Cup t2 = new Cup("Vadim",20);
        Plate t3 = new Plate("Nikita",15,"Blue");
        t1.displayInfo();
        t2.displayInfo();
        t3.displayInfo();
    }
}