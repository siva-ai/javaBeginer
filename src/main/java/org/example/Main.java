package org.example;

import data.types.PracticeDataTypes;

public class Main {
    public static void main(String[] args) {
       // PracticeDataTypes practiceDataTypes= new PracticeDataTypes();

        Rabbit rabbit = new Rabbit(123);

        String review="movies is not good.it is average. i will 3 ratings.2395732759.45";

        review=review.concat("----------");
         char c='e';
        System.out.println(review);


          rabbit.ID=243;

        //rabbit.addsum(3,4);
        //rabbit.makeRabbitrun();


        System.out.println("ID :"+rabbit.ID);
        System.out.println("name :"+rabbit.name);
        System.out.println("location :"+rabbit.location);
        rabbit.makeRabbitrun();
     //   practiceDataTypes.join();



      //  System.out.println("Hello world!");
    }
}