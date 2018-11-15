/*
implement circular queue
initial queue
 1 2 3 4 5 6 7 8
Deleted element :1
 2 3 4 5 6 7 8
queue full
Deleted element :2
 9 3 4 5 6 7 8

*/
class CircularQueue{
	static int[] arr;
	static int Size;
	static int count;                           // for counting number of elements
	static int front;
	static int rear;
    static void queueInit(int size)            //queue initialisation.
    {
    	Size=size;
     	arr=new int[size];
     	count=0;
     	front=-1;
     	rear=-1;
    }
    static void enqueue(int ele)                // insert element in queue
    {
     if(count== arr.length)
     {
     	System.out.println("queue full");
     }
     else
     {
     	rear=(rear+1)%arr.length;
     	arr[rear]=ele;
     	count++;
     	if(front==-1)
     		front=rear;

     }

    }
    static int dequeue()                          // delete element from queue.
    {
    	int delelement=-1;
      if(count==0)
      {
      	System.out.println("queue empty");
      }
      else
      {
      	delelement=arr[front];

      	front=(front+1)%arr.length;

      	count--;
      }
      return delelement;

    }
    static void print ()
    {
    	for (int i=0;i<front-1 ;i++ ) {
    		System.out.print(" "+arr[i]);
         }
    	for (int j=front;j<arr.length ;j++ ) {
    			System.out.print(" "+arr[j]);
    		}	
    	System.out.println();
    }

	public static void main(String[] args) {
		queueInit(8);
		enqueue(1);
		enqueue(2);
		enqueue(3);
		enqueue(4);
		enqueue(5);
        enqueue(6);
		enqueue(7);
		enqueue(8);
        
        print();
		
		System.out.println("Deleted element :"+dequeue());
        enqueue(9);
		print();
		enqueue(1);
		System.out.println("Deleted element :"+dequeue());
		print();
	}
}