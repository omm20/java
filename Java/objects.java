 class Box{
       int height=10;
       int weight=10;
       int depth=10; 
 int Box(int a, int b,int c){
           height=a;
           weight=b;
           depth=c;
        int res=a*b*c;
        return res;
       }
       int Box(int a,int b){
        height=a;
        weight=b;
        int res=a*b;
        return res;
       }
}
public class objects {
    public static void main(String args[]){
        Box ob=new Box();
        //ob.height=20;
        System.out.println( ob.height);
        System.out.println( ob.Box(20,20,20));
        System.out.println( ob.Box(20,20));


    }
    
}
