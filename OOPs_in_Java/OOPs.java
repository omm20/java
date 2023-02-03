public class OOPs {
    public static void main(String args[]){
        Pen p1=new Pen();
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        Bankacc ba=new Bankacc();
        ba.changeUsername("omm");
        System.out.println(ba.username);
        ba.changePassword(182003);
        System.out.println(ba.password);
    }
    
}
class Bankacc{
     public String username;
      int password;
    void changeUsername(String newname){
        username=newname;
    }
    void changePassword(int newpassword){
        password=newpassword;
    }

}
class Pen{
    String color;
    int tip;
    void setColor(String newcolor){
    color=newcolor; 
    }
    void setTip(int newtip){
        tip=newtip;
    }

    
}
