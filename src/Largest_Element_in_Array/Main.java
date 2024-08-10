//number 2
package Largest_Element_in_Array;

public class Main {

    public static void main(String[] args) {
    int[] ara = new int[] {1, 2, 30, 4, 50};
    int large = 0;
    for(int i=0; i<ara.length;i++){
        if(ara[i]>ara[i+1]){
            large = ara[i];
        }
        else 
            large = ara[i+1];
    }
    System.out.println("largest number: "+large);
    }
    
}
