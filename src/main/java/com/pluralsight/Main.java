package com.pluralsight;
import java.util.*;

public class Main
{

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {



        //Scanner sc = new Scanner(System.in);

        /*
        prompt user to enter name into different variables to be called by method below
         */
        System.out.print("Please enter your first name: ");
        String firstName = sc.nextLine().trim();

        System.out.print("Please enter your middle name: ");
        String middleName = sc.nextLine().trim();

        System.out.print("Please enter your last name: ");
        String lastName = sc.nextLine().trim();

        System.out.print("Please enter your Suffix: ");
        String suffix = sc.nextLine().trim();

        //firstname = firstName.indexOf(0).toUpperCase();

        if(!middleName.equals("") && !suffix.equals(""))
        {
            System.out.println("Your full name is: " + fullName(firstName,"", lastName,""));
        }else
        {
            System.out.println("Your full name is: " + fullName(firstName, middleName, lastName, suffix));

        }





        //System.out.println(fullName(firstName, middleName, lastName, suffix));

    }

    /*
    FullName method will be used to put together a full name
    will add variables in order to complete single variable returned by method
     */

    public static String fullName(String firstName, String middleName, String lastName, String suffix)
    {
        String name = firstName + " " + middleName + " " + lastName + " " + suffix;
        name = name.trim();

        return name;
    }
}