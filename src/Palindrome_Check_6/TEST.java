
package Palindrome_Check_6;

public class TEST {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    
    public static boolean isPalindrome(int x) {
        
        int orig_num=x;
    int rev=0;
    while(x > 0){
        int rem = x%10;
        rev=(rev*10) + rem;
        x=x /10;
    }
    
    
    if(rev == orig_num){
        return true;
    }else 
        
        
    return false;
        
    }
    
}
