package lambda;

import src.AbstractClass;

public class Main {
    public static void main(String ar[]){
        /*Example example = new Example();
        example.test("Testing lambda");*/

        //lambda -> Here there in no need to implement interface in Example.java because we have provided the implementation directly
        Book lambdaBook = a -> System.out.print(a);
        testThing(lambdaBook);
    }
    static void  testThing(Book lambdaBook){
        lambdaBook.test("Hello lambda!");
    }



}
