public class heko {

    static int sum = 0;
    static int count=0;
    
    public static boolean isSafe(int[]arr, int val, int maxSum){
        System.out.println("safe ");
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]==val){
                return false;
            }
        }
        System.out.print("sum= " + sum);
        sum = sum + val;
        
        System.out.print(" val= " + val);
        System.out.print(" sum= " + sum);
        if(sum>maxSum){
            return false;
        }
        return true;
    }
    
    public static int maxCount(int[] banned, int n, int maxSum) {
        
         for(int i=1; i<=n; i++){
            System.out.print("i=" + i + " ");
             if(isSafe(banned,i,maxSum)){
                System.out.println("count");
                count++;
            }
         }
        return count;
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7};
        int n=8;
        int maxSum = 1;
        
        System.out.println(maxCount(arr,n,maxSum));
    }
    
}