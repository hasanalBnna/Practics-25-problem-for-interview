
package Reverse_an_Array_4;

import java.util.Scanner;


public class ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str= sc.nextLine();
        String show = " " ;
        for(int i=str.length() - 1; i>=0 ;i--){
            //System.out.println(str.charAt(i));
             show += str.charAt(i);
    }
    System.out.println("Reverse this String: "+show);
    }
    
}
