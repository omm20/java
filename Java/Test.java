public class Test{

    public static void main(String [] args)
    {
        int n = 14;
        int rev = 0;
        
   while(n>0)   {
    int rem = n%10;
    n = n/10;
     rev = rev*10 + rem;
   }  
     System.out.println(rev);

       while(n>0){
        int bin = rev%2;
        System.out.println(bin + " ");
        System.out.println("h");
       }
    }

}

