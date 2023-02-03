//import java.util.*;
public class Sell {
    public static void main(String args[]){
        int[] num = {1,2,3,4,5};
        int min=num[0];
        int max=0;
        for(int i=0;i<num.length;i++){
            if(min>num[i]){
                min = num[i];
            }
            else{
                int profit = num[i] - min;
                max = Math.max(profit,max);
            }
        }
        System.out.println("min " + min);
        System.out.println("max " + max);
    } 
}
    
    

