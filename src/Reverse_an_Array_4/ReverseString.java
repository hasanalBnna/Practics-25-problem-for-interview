
package Reverse_an_Array_4;


public class ReverseString {

    public static void main(String[] args) {
    String str= "abcd";
    String show = " " ;
    for(int i=str.length() - 1; i>=0 ;i--){
        //System.out.println(str.charAt(i));
        show += str.charAt(i);
    }
    System.out.println("Reverse this String = "+show);
    }
    
}
