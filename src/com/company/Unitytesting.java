package com.company;

public class Unitytesting {
    public static void main(String[] args) {

        int [] num1s = {10,20,30,40,50};
        int [] num2s = {20,30,40,50,60};
        int [] sums = {30,50,70,90,120};

        for (int i = 0; i<num1s.length; i++){
            if (num1s[i] + num2s[i] == sums[i]){
                System.out.println("Test Passed");

            }else{
                System.out.println("Test Failed");
            }
        }
    }
    public static void add(int a, int b){

        System.out.println("The sum is "+(a-b));
    }
}
