package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Stock[]items;
        items=new Stock[3];
        for(int i=0;i<3;i++){
            items[i]=new Stock();
        }
        for(int i=0;i<3;i++){
            items[i].InputInFile();
            items[i].OutputOfFile();
        }
        int s=0,amount=0;
        for(int i=0;i<3;i++){
            s+=items[i].cost;
            if (items[i].available==true){
                amount++;
            }
        }
        System.out.print("Total cost: "+s+"\n Amount of available items: "+amount);


    }
}
