public class recursion1 {
    public static void main(String args[]){
    int sum = printn(10);
    System.out.println(sum);
    }

public static int  printn(int n){
    if(n==0){
        return 1;
    }
    int sum = n+printn(n-1);
    return sum;
}
}
