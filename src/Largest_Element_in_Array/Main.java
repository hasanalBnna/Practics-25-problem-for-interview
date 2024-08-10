//number 2
package Largest_Element_in_Array;

public class Main {

    public static void main(String[] args) {
    int[] ara = new int[] {1, 2, 30, 4, 50};
    int large = ara[0];
    for(int i=0; i<ara.length;i++){
        if(ara[i]>large)
            large = ara[i];
        
    }
    System.out.println("largest number: "+large);
    }
    
}
