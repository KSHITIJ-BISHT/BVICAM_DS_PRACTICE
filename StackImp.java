//Program to implement stack in java

/*
stack:[1]
stack:[1, 2]
stack:[1, 2, 3]
stack:[1, 2, 3, 4]
stack:[1, 2, 3, 4, 5]
stack:[1, 2, 3, 4, 5, 1]

position  of 2 from top
Element is found at position 5
position  of 1 from top
Element is found at position 1
position  of 5 from top
Element is found at position 2
poped:1
stack :[1, 2, 3, 4, 5]
poped:5
stack :[1, 2, 3, 4]
poped:4
stack :[1, 2, 3]
poped:3
stack :[1, 2]

position  of 4 from top
Element not found

*/


import java.util.Stack;
class StackImp{
    
    static void push_stack(Stack<Integer> stack,int a)
    {
    	stack.push(a);
    	System.out.println("stack:"+stack);

    }
    
    static void pop_stack(Stack<Integer> stack)
    {
    	int del=stack.pop();
    	System.out.println("poped:"+del);
    	System.out.println("stack :"+stack);
    }
    
    static void search_stack(Stack<Integer> stack, int element) 
    { 
        int pos = stack.search(element); 
  
        if(pos == -1) 
            System.out.println("Element not found"); 
        else
            System.out.println("Element is found at position " + pos); 
    } 
	public static void main(String[] args) {

		Stack<Integer> stack=new Stack<Integer>(); // creating empty stack
        
        push_stack(stack,1);
        push_stack(stack,2);
        push_stack(stack,3);
        push_stack(stack,4);
        push_stack(stack,5);
        push_stack(stack,1);
        search_stack(stack,2);
        search_stack(stack,1);
        search_stack(stack,5);
        pop_stack(stack);
        pop_stack(stack);
        pop_stack(stack);
        pop_stack(stack);
        search_stack(stack,4);
        
	}
}