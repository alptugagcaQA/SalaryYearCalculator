package com.company;

import java.util.Scanner;

public class WorkerYear
{
    public void yearCalculator(double salary, int year)
    {
        if(year == 1)
        {
            double montlySalary = (salary * 4);
            double yearSalary = (montlySalary * 5 / 100 )+ montlySalary;
            System.out.println("The monthly salary that the employee should receive according to the years of experience. : " + yearSalary+ "€");
        }
        else if (year == 2)
        {
            double montlySalary = (salary * 4);
            double yearSalary = (montlySalary * 10 / 100 )+ montlySalary;
            System.out.println("The monthly salary that the employee should receive according to the years of experience. : " + yearSalary+ "€");

        }
        else if (year == 3)
        {
            double montlySalary = (salary * 4);
            double yearSalary = (montlySalary * 15 / 100 ) + montlySalary;
            System.out.println("The monthly salary that the employee should receive according to the years of experience. : " + yearSalary+ "€");

        }
        else if (year == 4)
        {
            double montlySalary = (salary * 4);
            double yearSalary = (montlySalary * 20 / 100 )+ montlySalary;
            System.out.println("The monthly salary that the employee should receive according to the years of experience. : " + yearSalary + "€");

        }
        else if (year >= 5)
        {
            double montlySalary = (salary * 5);
            double yearSalary = (montlySalary * 25 / 100 )+ montlySalary;
            System.out.println("The monthly salary that the employee should receive according to the years of experience. : " + yearSalary+ "€");

        }
    }

}
