import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		
		
		System.out.println("Index of Searched element: "+Search(arr));

	}
	
	
	public static int Search(int[] arr)
	{
		int low=0;
		int high=arr.length;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter value which you want to get index of: ");
		int y=sc.nextInt();
		
		while(low<high)
		{
			int mid= (low+high)/2;
			
			if(arr[mid]==y)
			{
				return mid;
			}
			else if(arr[mid]<y)
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		
		
		return -1;
	}

}
