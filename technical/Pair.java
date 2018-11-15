	// find the pair having sum inputted by user using quick sort
	class Pair
	{   
	   static int partition(int arr[], int low, int high) 
	    { 
	        int pivot = arr[high];  
	        int i = (low-1); 
	        for (int j=low; j<high; j++) 
	        {  
	            if (arr[j] <= pivot) 
	            { 
	                i++; 
	                int temp = arr[i]; 
	                arr[i] = arr[j]; 
	                arr[j] = temp; 
	            } 
	        } 
	        int temp = arr[i+1]; 
	        arr[i+1] = arr[high]; 
	        arr[high] = temp; 
	  
	        return i+1; 
	    }
	  static void sort(int arr[], int low, int high) 
	    { 
	        if (low < high) 
	        { 
	            int pi = partition(arr, low, high);
	            sort(arr, low, pi-1); 
	            sort(arr, pi+1, high); 
	        } 
	    }

		public static void main(String[] args) {
		

		         int[] arr=new int[]{3,-5,1,-2,7,-3,6};
		          int k=4; 
		         int i=0,j=arr.length-1;
		         sort(arr,0,6);
			     while(i<j)
                   {
		            if((arr[i]+arr[j])==k)
		             {
		             	System.out.println(i+","+j);
		              	i=i+1;
		              }
		            else
		             if(k>(arr[i]+arr[j]))
		               i=i+1;
		              else
		              	if(k<(arr[i]+arr[j]))
		              	j=j-1;
		             }

	}
	}