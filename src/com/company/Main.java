package com.company;

import java.util.Date;

public class Main {
    public static void main(String[] args){
        News n1 = new News("John","src1",new Date(),new Date(),"Hello world");
        System.out.println(n1.toString());
    }
}
