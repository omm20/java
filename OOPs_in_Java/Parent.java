public class Parent {
    public static void main(String args[])
    {  
        P p=new P();
        p.property();
        p.marry();

        C c=new C();
        c.property();
        c.marry();

        P p1=new C();
        p1.marry();       
    }
}
    class P{
        public void property()
        {
            System.out.println("land,jewellery");
        }
        public void marry()
        {
            System.out.println("atnisha,aman");
        }
    }
    class C extends P
    {
        public void marry()
        {
            System.out.println("muskan,pratima");
        }
    }
    

