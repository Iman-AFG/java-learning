public class Queue_array {

	private int[] queueArray;
	private int front;
	private int rear;
	private int max_size;

    public  Queue_array(int max_size) {
		this.max_size = max_size;
		front = -1;
		rear = -1;
		queueArray = new int[max_size];	
	}

    public void enque(int value) {
		if(front <0 && rear <0 ) {
			front = 0;
			rear = 0;
			queueArray[rear] = value;
			
		} else {
			queueArray[++rear] = value;			
		}
	}

    public boolean deque() {
		if(front < 0 && rear < 0) {
			return false;
		}else {
			queueArray[front] = 0;
			front += 1;
			return true;
		}
	}

    public int peek() {
		if(front < 0 && rear< 0 ) return 0;

		else {	return queueArray[front];  }
	}
	
	public void display(){
		int temp = rear;
		while (temp != -1) {
			System.out.println(queueArray[rear]);
			temp ++;
		}
	}
}
