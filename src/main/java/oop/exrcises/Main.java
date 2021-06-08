package oop.exrcises;
import java.util.Scanner;
/*
 * UCF cop3330 Summer 2021 Assignment 1 solutions
 * Copyright 2021 Keondez Robinson
 */
public class Main
{
    public static void main(String[] args)
    {
        String password, userName, validated;
        Scanner input;

        validated = "abc$123";
        input = new Scanner(System.in);

        System.out.print("What is the username? ");
        userName = input.next();

        System.out.print("What is the password? ");
        password = input.next();

        if (validated.equals(password))
        {
            System.out.println("Welcome!");
        } else
        {
            System.out.println("I don't know you.");
        }
    }
}
