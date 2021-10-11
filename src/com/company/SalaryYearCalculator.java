package com.company;

import java.util.Scanner;

public class SalaryYearCalculator {

    public static void main(String[] args)
    {
        WorkerYear workerYear = new WorkerYear();
        int baseSalaryHours = 1000/40;
        int weekdaysBaseHour = 40;
        int weekendBonus = 500;
        double weekdaysUnitCharge = baseSalaryHours * 1.5;
        double weekendDaysUnitCharge = baseSalaryHours * 2;

        System.out.println("Please Enter your weekday working hours");
        Scanner scanner = new Scanner(System.in);
        int weekdaysHours = scanner.nextInt();
        System.out.println("Enter your weekend working hours");
        int weekendHours = scanner.nextInt();
        System.out.println("How many years have you been working in this company?");
        int year = scanner.nextInt();
        scanner.close();
        //Case 1- Hafta içi 40 saat dahil 40 saat'den az çalışır && Haftasonu çalışmaz.
        if((weekdaysHours <= 40) && (weekendHours == 0))
        {
            int salary = baseSalaryHours * weekdaysHours;
            System.out.println("Worker Weekly Salary : " + salary + "€");
            workerYear.yearCalculator(salary,year);
        }
        //Case 2-  Hafta İçi 40 saat fazla çalışır && Hafta sonu çalışmaz.
        else if ((weekdaysHours >40) && (weekendHours == 0))
        {
            double extraHourSalary = (weekdaysHours - weekdaysBaseHour) * weekdaysUnitCharge;
            double salary = (baseSalaryHours * 40) + extraHourSalary;
            System.out.println("Worker Weekly Salary : " + salary + "€");
            workerYear.yearCalculator(salary,year);
        }
        //Case 3-  Hafta içi 40 saat çalışır . Hafta sonu 10 saatten az çalışır.
        else if ((weekdaysHours == 40) && (weekendHours <= 10))
        {
            double weekendExtraHourSalary = weekendHours * weekendDaysUnitCharge;
            double salary = (baseSalaryHours * 40) + weekendExtraHourSalary;
            System.out.println("Worker Weekly Salary : " + salary + "€");
            workerYear.yearCalculator(salary,year);
        }
        //Case 4-  Hafta içi 40 saat çalışır . Hafta sonu 10 saatten fazla çalışır.
        else if ((weekdaysHours == 40) && (weekendHours > 10))
        {
            double weekendExtraHourSalary = weekendHours * weekendDaysUnitCharge;
            double salary = (baseSalaryHours * 40) + weekendExtraHourSalary + weekendBonus;
            System.out.println("Worker Weekly Salary : " + salary + "€");

            workerYear.yearCalculator(salary,year);
        }
        //Case 5- Hafta içi 40 saat fazla çalışır. Hafta sonu 10 saat'den az çalışır.
        else if ((weekdaysHours > 40) && (weekendHours <= 10))
        {
            double weekdayExtraHourSalary = (weekdaysHours - weekdaysBaseHour) * weekdaysUnitCharge;
            double weekendExtraHourSalary = weekendHours * weekendDaysUnitCharge;
            double salary = (baseSalaryHours * 40) + weekendExtraHourSalary + weekdayExtraHourSalary;
            System.out.println("Worker Weekly Salary : " + salary + "€");
            workerYear.yearCalculator(salary,year);

        }
        //Case 6 = Hafta içi 40 saat fazla çalışır. Hafta sonu 10 saat'dan fazla çalışır.
        else if ((weekdaysHours > 40) && (weekendHours > 10))
        {
            double weekdayExtraHourSalary = (weekdaysHours - weekdaysBaseHour) * weekdaysUnitCharge;
            double weekendExtraHourSalary = weekendHours * weekendDaysUnitCharge;
            double salary = (baseSalaryHours * 40) + weekendExtraHourSalary + weekdayExtraHourSalary +weekendBonus;
            System.out.println("Worker Weekly Salary : " + salary + "€");
            workerYear.yearCalculator(salary,year);

        }
        //Case 7 = Kullanıcı negatif sayı girmemeli.
        else if ((weekdaysHours <0) && (weekendHours <0))
        {
            System.out.println("Please enter positive numbers");
        }
        //Case 8 = Kullanıcı geçersiz karakter girer.
        else
        {
            System.out.println("Invalid Characher");
        }
    }
}
