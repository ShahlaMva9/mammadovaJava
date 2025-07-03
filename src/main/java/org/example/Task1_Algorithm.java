package org.example;
import java.util.Arrays;
import java.util.Scanner;

public class Task1_Algorithm {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //1
        System.out.println("Enter the number");
        double number=scanner.nextDouble();
        scanner.nextLine();
        if(number>7){
            System.out.println("Hello");
        }

        //2
        System.out.println("Enter the name");
        String name=scanner.nextLine();
        if(name.equals("John")){
            System.out.println("Hello, John");
        } else {
            System.out.println("There is no such name");
        }

        //3
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println("List is " +Arrays.toString(arr));
        int [] newArr=new int [arr.length];

        for (int i=0;i<arr.length;i++){
            newArr[i]=arr[i]*3;
        }
        System.out.println("Multiply to 3 list is "+ Arrays.toString(newArr));
    }
}

