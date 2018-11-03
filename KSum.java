//find the pairs for the given sum
/*
array=10,4,5,1,8,3,6
sum=7
pairs: 4 3 ; 1 6
*/
import java.util.*;
class KSum{
	public static void main(String[] args) {
		int[] arr=new int[]{10,4,5,1,8,3,6};
		int sum=7;
		HashSet<Integer> map=new HashSet<>();

		for (int i=0;i<arr.length ;i++ ) {
			int diff=sum-arr[i];
			if(map.contains(diff))
			{
				System.out.println(diff+" "+arr[i]);


			}
			else
			{	map.add(arr[i]);

			}
		}
		//System.out.println(map);
	}
}