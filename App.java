package com.wikipedia;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.next();
        System.out.println( "Hello World! " + name);
    }
}
