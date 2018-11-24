//Check if the binary tree given is BST or not

class CheckBst
{   
	static int arr[]={5,4,10,2,-1,6,13};          // -1 denotes no child
      static int count;
	static int parents;
   
    CheckBst()
    {
    	for (int i=0;i<arr.length ;i++ ) {
            if(arr[i]>=0)
               count++;    		
    	}
    	 parents=(int)Math.ceil(count/2);
    }

                                                  // checking left child small and right child bigger than the parent
	static void findBst(int root)
	{  
        if(root>parents-1)
        	System.out.println("tree is bst");
		else if((arr[root]<arr[2*root+2] ||arr[2*root+2]==-1 )&& (arr[root]>arr[2*root+1] || arr[2*root+1]==-1))
		   findBst(root+1);
		else
			System.out.println("Not Bst");
	}

	public static void main(String[] args) 
	{   CheckBst obj=new CheckBst();
		findBst(0);
	}
}