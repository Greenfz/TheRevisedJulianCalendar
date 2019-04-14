package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String toExit = "";
        while (!toExit.equals("exit")) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the first year:");
            int startYear = input.nextInt();
            System.out.println("Enter the last year:");
            int endYear = input.nextInt();
            countLeapYears(startYear, endYear);

            System.out.println("If u want to quit type 'exit' or type anything else to repeat: " );
            input.nextLine();
            toExit = input.nextLine().toLowerCase();
        }
    }

    public static long countLeapYears(int start, int end){

        if (start > end){
            System.out.println("First year should be less than the last one." +
                    "");
            return -1;
        }
        int count = 0;
        // Checking if start is evenly divisible by 4 to do not increase by 1 in while loop
        if ((start % 4) != 0){
            start += 4 - (start % 4);
        }
        while (start < end){
            // Checking others conditions
            if ((start % 100 != 0) || (start % 900 == 200) || (start % 900 == 600)){
                System.out.println(start);
                count++;
            }
            start += 4;
        }
        System.out.println("There is " + count + " leap years between those");
        return count;
    }
}
