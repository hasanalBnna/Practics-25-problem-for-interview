/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Reverse_an_Array_4;

import java.util.Scanner;

public class Main2 {


public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    
    int num =sc.nextInt();
    int orig_num=num;
    int rev=0;
    while(num != 0){
        rev=rev*10 + num%10;
        num=num /10;
    }
    System.out.print(rev);
}
}