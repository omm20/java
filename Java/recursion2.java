
public class recursion2 {
    public static void main(String[] ags ){
        decNo(10);
        
    }
    public static void decNo(int n){
        // System.out.println(n);
        if(n==0){
            return ;
        }
        System.out.print(" " + n);
        decNo(n-1);
    }
    
}
