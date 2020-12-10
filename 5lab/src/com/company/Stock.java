package com.company;

import java.io.*;

public class Stock {
    public String name;
    public double cost;
    public boolean available;

    Stock() throws IOException{
        String str;
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in,"Cp1251"));
        System.out.print("\nEnter the name: ");
        this.name=input.readLine();
        System.out.print("\nEnter the cost: ");
        this.cost=Double.parseDouble(input.readLine());
        while(true){
            System.out.println("Is it available? (Yes/No)");
            str=input.readLine();
            if("Yes".equals(str)){
                this.available=true;
                break;
            }
            else if("No".equals(str)){
                this.available=false;
                break;
            }
            System.out.print("\nError! Try again!");
        }
    }
    public void InputInFile()throws  IOException{
        File file=new File("laba5.doc");
        file.deleteOnExit();

        FileWriter writer;
        writer=new FileWriter(file,true);
        writer.append("\nName: "+this.name+"\nCost: "+this.cost+";");
        if(this.available){
            writer.append("\n Available");
        }
        else{
            writer.append("\n Not available");
        }
        writer.flush();
        writer.close();
    }
    public static void OutputOfFile() throws IOException{
        File file=new File("laba5.doc");

        FileReader reader;
        char buffer[];
        int numb;
        buffer=new char[1];
        reader=new FileReader(file);
        do{
            numb=reader.read(buffer);
            System.out.print(buffer[0]);
        }while(numb==1);
        reader.close();
    }
}
