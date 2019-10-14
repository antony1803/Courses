package sample;


import sample.flowers.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<Flower> array= new ArrayList<>();
        array.add(new Rose());
        array.add(new Chamomile());
        array.add(new Aster());
        array.add(new MayLily());
        double totalCost=0;
        for(int i = 0; i<array.size();i++){

            array.set(i, array.get(i).grow(3*i));
            array.get(i).bloom();
            totalCost+=array.get(i).getCost();
        }
        Collections.sort(array);
        System.out.println(array);
        System.out.println(totalCost);
    }
}
