package com.company;

import java.util.Scanner;

public class Main {

    //Note: This question required strict time constraints, so i had to use this logic.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        int a, b, count1=0, count;
        for(int i=0; i<testCases; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            count = 0;
            count1 = 0;
            for(int j=a; j<=b; j++){
                if(Math.sqrt(j)==(int)(Math.sqrt(j))){
                    count1 = (int)Math.sqrt(j);
                    //count++;
                    break;
                }
            }
            while(count1!=0 && Math.pow(count1,2)<=b) {
                count++;
                count1++;
            }
            System.out.println(count);
        }
    }
}
