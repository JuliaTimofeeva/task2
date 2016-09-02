package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList x = new ArrayList();
        x.add("Юля");
        x.add(5);
        x.add('a');
        ArrayList y = new ArrayList();
        y.add(1);
        y.add("Юля");
        y.add('+');
        y.add(5);
        y.add("цветы");
        y.add(4);
        y.add('a');

        int i = 0;
        int j = 0;
        int xSize = x.size();
        int ySize = y.size();
        boolean f;
        int k = 0;

        while (i<xSize){
            f = false;
            while ((j<ySize)&&(f==false)){
                if (x.get(i).equals(y.get(j))){
                    f = true;
                    k++;
                }
                j++;
            }
            i++;
        }
        if(xSize == k)
        {
            System.out.print("Можно получить последовательность");
        }else{
            System.out.print("Нельзя получить последовательность");
        }
    }
}
