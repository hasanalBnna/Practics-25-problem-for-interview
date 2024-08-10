// number 3
package Even_or_Odd_Numbers;

public class Main {

    public static void main(String[] args) {
    int[] ara = new int[]{1, 2, 30, 4, 50};
    for(int i=0;i<ara.length;i++){
        if(ara[i] % 2 == 0){
            System.out.println(ara[i] +" is even");
        }else
            System.out.println(ara[i]+" is odd");
    }
    }
    
}
