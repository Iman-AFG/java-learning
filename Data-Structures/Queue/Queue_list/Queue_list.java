public class Queue_list {
    Node front = null;
    Node rear = null;

    public void enque(int data){
        Node newNode = new Node(data);
        if (front == null) {
            front = newNode;
            rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

        public void peek(){
        System.out.println(front.data + " ");
    }

    public Node deque(){
        Node temp = front;
            front = front.next;
        return temp;
    }

    public void display(){
        Node curnt = front;
        while (curnt != null) {
            System.out.print(curnt.data + " ");
            curnt = curnt.next;
        }

    }
}
