public class Queue {
     int queueLength = 3;
     int items[] = new int[queueLength];
     int Front = -1;
     int Rear = -1;
    boolean isFull(){
        if(Rear == queueLength-1)
        {
           return true;
        }
        else
        {
            return false;
        }
    }
    boolean isEmpty()
    {
        if(Front == -1 && Rear == -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    void enQueue(int itemValues)
    {
        if(isFull()){
            System.out.println("its full");
        }
        else if(Front == -1 && Rear == -1)
        {
            Front = Rear = 0; 
            items[Rear] = itemValues;      
        }
        else
        {
            Rear++;
            items[Rear] = itemValues;
        }
    }
    void deQueue(){
        if(isEmpty())
        {
            System.out.println("its empty");
        }
        else if(Front == Rear)
        {
            Front = Rear = -1;
        }
        else{
            Front++;
        }
    }
    void display(){
        int i;
       
        if(isEmpty()){
            System.out.println("Queue is empty");
        } 
        else {
            for(i = Front; i <= Rear; i++){
                System.out.println(items[i]);
            }
        }
    }
    
    void peek(){
        System.out.println("Front value is: " + items[Front]);
    }
    public static void main(String[] args) {
        Queue Q = new Queue();
        
        Q.enQueue(3);
        Q.enQueue(2);
        Q.enQueue(1);
    
        
        Q.display();
        
        Q.peek();
        
        
      }
    
  }
  
    

