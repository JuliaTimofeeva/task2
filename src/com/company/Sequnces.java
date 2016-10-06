package com.company;

import java.util.ArrayList;


public class Sequnces {
    private ArrayList x;
    private ArrayList y;


   
    public Sequnces(ArrayList x, ArrayList y) {
        this.x = x;
        this.y = y;
    }


    public boolean includeSequence(){
        if(x.size() == getNumberOfMatches())
        {
            return true;
        }else{
            return false;
        }
    }

    //возвращает число совпадений
    private int getNumberOfMatches(){
        int i = 0;
        int j = 0;

        boolean f;
        int k = 0;

        while (i<x.size()){
            f = false;
            while ((j<y.size())&&(f==false)){
                if (x.get(i).equals(y.get(j))){
                    f = true;
                    k++;
                }
                j++;
            }
            i++;
        }
        return k;
    }

}
