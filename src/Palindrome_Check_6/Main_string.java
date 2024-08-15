
package Palindrome_Check_6;

import java.util.Scanner;

public class Main_string {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str= sc.nextLine();
        String show = "" ;
        for(int i=str.length() - 1; i>=0 ;i--){
            show = show + str.charAt(i);
    }
        if(str.equals(show)){
            System.out.println("String is a palindrom");
        }
        else
            System.out.println("String is not a palindrom");
    
    }
    
}
