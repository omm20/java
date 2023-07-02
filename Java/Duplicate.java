public class Duplicate {
   public static int dup(int []arr)
   {
    int ans = 0;
        for(int i=0;i<arr.length;i++)
        {
            ans=ans^arr[i];
        }
        for(int i=1;i<arr.length;i++)
        {
            ans=ans^i;
        }
        return ans;
    }
    public static void main(String []args){
        //System.out.println("dbjhdvgfuy");
        int arr[]={1,2,3,1};      
    dup(arr);
        
    }
}
