package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
public class Printer
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        Quote myQuote = new Quote();
        Author myAuthor = new Author();

        System.out.print( "What is the quote? " );
        String theQuote = input.nextLine();
        myQuote.setString(theQuote);
        System.out.print( "Who said it? ");
        String theAuthor = input.nextLine();
        myAuthor.setName(theAuthor);

        System.out.printf("%s%s%s%s", myAuthor.getName(), " says, \"", myQuote.getString(), "\"");
    }
}
