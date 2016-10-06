package com.company;

import java.util.ArrayList;

public class Main {



    public static void main(String[] args) {

        ArrayList x = new ArrayList();
        MyObject myObject = new MyObject();
        myObject.one = 'f';
        myObject.two = "hh";
        myObject.three = 1;
        Object j = 'f';

        x.add("Юля");
        x.add(5);
        x.add('a');
        x.add(myObject);


        ArrayList y = new ArrayList();
        y.add(1);
        y.add("Юля");
        y.add('+');
        y.add(5);
        y.add("цветы");
        y.add(4);
        y.add('a');

        Sequnces sequnces = new Sequnces(x,y);


        if(sequnces.includeSequence())
        {
            System.out.print("Можно получить последовательность");
        }else{
            System.out.print("Нельзя получить последовательность");
        }
    }

}

