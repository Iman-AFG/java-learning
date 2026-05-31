
public class Main{
    public static void main(String []args){

        LinkedList list = new LinkedList();

        list.insertAtFirst(5);
        list.insertAtFirst(6);
        list.insertAtLast(7);

        list.insertAtLast(4);

        list.insertAfterKey(6, 7);
        
        
        
        list.display();
    }
}