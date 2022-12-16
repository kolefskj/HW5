package HW5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListPlayground {
    public static void main(String[] args) {
        System.out.println("Start of HW5");
        // Question 1
        // Write Java statements that do the following:
        // a) Declare an arrayList nums of 15 elements of type Integer.
        // b) Output the value of the tenth element of the array nums.
        // c) Set the value of the 5th element of the array nums to 99.
        // d) set the value of the 13th element to 15
        // d) set the value of the 2nd element to 6
        // d) Set the value of the 9th element of the array nums to the sum of the 13th
        // and 2nd elements of the array nums.
        int n = 15;
        
        ArrayList<Integer> arrayLis = new ArrayList<Integer> (n);

        for (int k = 1; k <= n; k++)
        {
            ArrayLis.add(k);
        }

        int e5 = arrayList.set(5, 99);
        int e13 = arrayList.set(13, 15);
        int e2 = arrayList.set(2, 6);
        int e9 = arrayList.add(arrayLis.get(13)+ arrayLis.get(2));

        for (int x = 0; x< arrayLis.size(); x++)
        {
            System.out.print(arrayLis.get(k) + " ");
        }

        // Question 2
        // a) create an arrayList of Strings that contain each day of the week.(starting
        // on monday)
        // b) output each of the days of the week
        // c) output the days of the week that we have class
        // d) change the arrayList to start on Sunday
        ArrayList<String> daysOfTheWeek = new ArrayList<String>();
        daysOfTheWeek.add("Sunday");
        daysOfTheWeek.add("Monday");
        daysOfTheWeek.add("Tuesday");
        daysOfTheWeek.add("Wednesday");
        daysOfTheWeek.add("Thursday");
        daysOfTheWeek.add("Friday");
        daysOfTheWeek.add("Saturday");

        System.out.println(daysOfTheWeek);
        System.out.println(daysOfTheWeek.get(3));
        System.out.println(daysOfTheWeek.get(4));

        // Question 3
        // a) create an ArrayList and prompt the user for numbers to add to it until the
        // number 0 is selected
        // b) return the largest and smallest number
        // c) return the ArrayList sorted smallest to largest
        // d) take that ArrayList see if its size is divisable by 3 and then output the
        // ArrayList in a matrix format
        // NOTE: make the matrix n X 3 so it can be n rows by 3 columns
        // EX. ArrayList [1,2,3,4,5,6,7,8,9]
        // 1 2 3
        // 4 5 6
        // 7 8 9
        // NOTE: If the ArrayList is NOT divisable by 3 ask the user for more numbers
        // and add them until it is
        // ArrayList Size: 7
        // Please enter 2 more numbers to create the matrix...
        //
        // Hint 1: use collections sort to sort the numbers
        // Hint 2: you can see if the size of the array list is divisible by 3 by
        // running:
        // numbers.size()%3==0
        // Hint 3: You can use this logic to print the array list in a 3x3 pattern once
        // its created:
        // for(int i=0;i<numbers.size();i++)
        // {
        // System.out.print(numbers.get(i)+" ");
        // if((i+1)%3==0)
        // {
        // System.out.println();
        // }
        // }
        ArrayList<Integer> arrayNum = new ArrayList<Integer> ();
        int num = 0;
        int min = arrayNum.get(0);
        int max = arrayNum.get(0);
        int arraySize = arrayNum.size();
        Scanner userInput = new Scanner(System.in);
        while (scanner.hasNextInt())
        {
            num = scanner.nextInt();
            arrayNum.add(num);
            if (num == 0)
            {
                System.out.println(arrayNum);
            }
        }
        for (int j = 1; j < arraySize; j++)
        {
            if (arrayNum.get(j) < min)
            {
                min = arrayNum.get(j);
            }
        }
        for (int j = 1; j < arraySize; j++)
        {
            if (arrayNum.get(j) > max)
            {
                max = arrayNum.get(j);
            }
        }
        Collections.sort(arrayNum);
        int[][] matrixPrint = arrayNum.get(0);
        for(int t : arrayNum)
        {
            if (t % 3 == 0)
            {
                System.out.println(matrixPrint);
            }
            if (t % 3 != 0)
            {
                System.out.println("Please add more numbers to make arraylist divisible by 3");
            }
        }
    }
}
