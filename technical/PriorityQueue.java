//Implement priority queue largest element has highest priority
/*
7654321
87654321
Deleted element :8
queue full
7654321
queue full
Deleted element :7
654321
*/

class PriorityQueue{
	static int[] arr;
	static int Size;
	                         
	static int front;
	static int rear;
    static void queueInit(int size)            //queue initialisation.
    {
    	Size=size;
     	arr=new int[size];
     	front=-1;
     	rear=-1;
    }
    static void enqueue(int ele)                // insert element in queue
    {
     if(rear==arr.length-1)
     {
     	System.out.println("queue full");
     }
     else
     {
      rear++;
  
     	count++;
      int k=0;
       loop:for( k=count-1;k>=0;k--)
        {
          if(ele>arr[k])
          {
            arr[k+1]=arr[k];
          }
          else
            break loop;
        }
        arr[k+1]=ele;


     	if(front==-1)
     		front=rear;
      

     }

    }
    static int dequeue()                          // delete element from queue.
    {
    	int delelement=-1;
      if(front==-1)
            {
      	System.out.println("queue empty");
      }
      else
      {
      	delelement=arr[front];

      	front=(front+1);
      }
      return delelement;

    }
    static void print ()
    {
    	
        for (int t=front;t<=rear ;t++ ) {
          System.out.print(arr[t]);
            
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
    print();
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