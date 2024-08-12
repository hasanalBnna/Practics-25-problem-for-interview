
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
        rev=rev*10 + num%10;
        num=num /10;
    }
    if(orig_num == rev){
        System.out.println(orig_num+ " is palindrom");
    }else 
        System.out.print(orig_num+ " is not");
}

}
          

