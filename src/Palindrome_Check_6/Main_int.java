
package Palindrome_Check_6;

import java.util.Scanner;

public class Main_int {


public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    
    int num =sc.nextInt();
    int orig_num=num;
    int rev=0;
    while(num != 0){
        int rem = num%10;
        rev=rev*10 + rem;
        num=num /10;
    }
    if(orig_num == rev){
        System.out.println("Number is palindrom");
    }else 
        System.out.println("Number is not a palindrom");
}

}
          

