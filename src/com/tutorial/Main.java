package com.tutorial;

import com.tutorial.lambdas.LambdasDemo;
import com.tutorial.lambdas.Printer;
import com.tutorial.lambdas.ConsolePrinter;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //lambda expression
        greet((String message)->{
            System.out.println("Hello world");
        });

        greet((message)->{
            System.out.println("Hello world");
        });

        //only with single parameter
        greet(message->{
            System.out.println("Hello world");
        });

        //if method body has a single line of code
        greet(message-> System.out.println("Hello world"));

        //add lambda expression to a parameter
        Printer printer = message -> System.out.println("Hello world");

        LambdasDemo.show();

        //consumer interface
        List<Integer> intList = List.of(1,2,3,4,5,6,7);
        intList.forEach(i -> System.out.println(i));

        LambdasDemo.chainingConsumers();

        greet(new Printer() {
            @Override
            public void print(String message) {
                System.out.println("Hello world");
            }
        });;
    }
    public static void greet(Printer printer){
        printer.print("Hello world");
    }
}
