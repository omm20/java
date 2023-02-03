public class SubSequence {
    public static void main(String args[])
    {
        
        String str = "abcde";
        String[] arrOfStr = str.split("d", 3);
  
        for (String a : arrOfStr)
            System.out.println(a);
    }
}
