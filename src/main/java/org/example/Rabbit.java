package org.example;

public class Rabbit {

    String name;//attributes
    int ID;
    String location;


    Rabbit() {

    }

    Rabbit(String name,int ID){
        this.name=name;
        this.ID=ID;
        this.location=location;
    }

    Rabbit(String name,int ID,String location){
        this.name=name;
        this.ID=ID;
        this.location=location;
    }

    Rabbit(String name){
        this.name=name;
        this.ID=ID;
        this.location=location;
    }

    Rabbit(int ID){
        this.name=name;
        this.ID=ID;
        this.location=location;
    }




    public void makeRabbitrun() {


        System.out.println("rabbit running");
    }

    public void addsum(int a,int b){
        System.out.println(a+b);
        System.out.println(a*b);
    }

}
