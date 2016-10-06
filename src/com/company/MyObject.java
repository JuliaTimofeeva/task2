package com.company;


public class MyObject {
    char one = ' ';
    String two = "";
    int three = 0;
    @Override
    public boolean equals(Object obj) {
        super.equals(new MyObject());
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MyObject other = (MyObject) obj;
        if (one != other.one)
            return false;
        if (two != other.two)
            return false;
        if (three != other.three)
            return false;
        return true;
    }
}
