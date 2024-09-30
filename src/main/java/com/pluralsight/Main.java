package com.pluralsight;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        /*
        prompt user to enter name into different variables to be called by method below
         */
        System.out.println("Please enter your first name: ");
        String firstName = sc.nextLine();
        System.out.println("Please enter your middle name: ");
        String middleName = sc.nextLine();
        System.out.println("Please enter your last name: ");
        String lastName = sc.nextLine();

        System.out.println(fullName(firstName, middleName, lastName));

    }

    /*
    FullName method will be used to put together a full name
    will add variables in order to complete single variable returned by method
     */

    public static String fullName(String firstName, String middleName, String lastName)
    {
        String name = firstName + " " + middleName + " " + lastName;
        name = name.trim();

        return name;
    }
}