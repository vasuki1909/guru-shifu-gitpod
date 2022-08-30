package com.thoughtworks.rectangle;

class Rectangle{
    private int length ;
    private int breadth;
    
    public Rectangle() {
    }

    int area(int length,int breadth)
    {
        /* if(length <0 || breadth <0)
        return 0; */
        return length*breadth;
    }
   
}