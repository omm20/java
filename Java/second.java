import java.util.*;
public class second{
    public static void main(String args[]){
        System.out.println("Hello world");
        System.out.println("Enter income");
        Scanner sc=new Scanner(System.in);
        int income=sc.nextInt();
        System.out.println("Income before tax"+income);
        int tax;
        if(income<500000){
            tax=0;
        }
        else if(income>=500000 && income<1000000){
            tax=(int)(income*0.2);
        }
        else{
            tax=(int)(income*0.3);
        }
        System.out.println("Income after tax"+ tax);

    }
}
