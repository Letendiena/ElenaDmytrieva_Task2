package ai.skillo;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Printer myPrinter = new Printer();
        System.out.println(myPrinter.getColor());
        System.out.println(myPrinter.material);
        System.out.println(myPrinter.length);
        System.out.println(myPrinter.blackAndWhitInk);
        System.out.println(myPrinter.getPrice());

        int hairLength = 40;
        int hairLengthInYear;
        hairLengthInYear = hairLength + (12 * 1);
        System.out.println("Hair length in 1 year will be: " + hairLengthInYear + "cm.");

        int year;
        int date;
        int mounth;
        int yearOfBirth;
        year = 2020;
        date = 10;
        mounth = 8;
        yearOfBirth = year - 21;

        Scanner s1 = new Scanner(System.in);
        System.out.println("Please enter age:");
        int age = s1.nextInt();

        if (age >= 21 && age > 0) {
            System.out.println("You can sell tobacco products to this person");
        } else {
            System.out.println("Selling tobacco products prohibited for person less 21 years old.");
            System.out.println("Date of birth should be after: " + yearOfBirth + "/" +  mounth + "/" + date + ".");
        }

        //found max number in 3 numbers

        int a = 25;
        int b = 100;
        int c = 1222;
        int max;

        if (a > b) {max = a;
        } else {max = b;
        }
        if (a == b) {max = a;
        } else if (c > max) {max = c;
        } else if (c == max) {max = c;
        }
        System.out.println(max);

        int month = 8;
        switch (month) {
            case 1: System.out.println("January");
                break;
            case 2: System.out.println("February");
                break;
            case 3: System.out.println("March");
                break;
            case 4: System.out.println("April");
                break;
            case 5: System.out.println("May");
                break;
            case 6: System.out.println("June");
                break;
            case 7: System.out.println("July");
                break;
            case 8: System.out.println("August");
                break;
            case 9: System.out.println("September");
                break;
            case 10: System.out.println("October");
                break;
            case 11: System.out.println("November");
                break;
            case 12: System.out.println("December");
                break;
            default:
                System.out.println("Not a valid month number");
        }
    }
}

