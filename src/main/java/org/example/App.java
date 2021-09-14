/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Blake Baez
 */
package org.example;
import java.util.Scanner;

public class App 
{
        public static void main(String[] args) {
            Scanner sentence = new Scanner(System.in);
            System.out.print("What is the quote? ");
            String quote = sentence.nextLine();

            System.out.print("Who said that? ");
            String author = sentence.nextLine();

            System.out.println(author + " says, \"" + quote + ".\"");
        }
    }