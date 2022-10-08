
public class FindIntersection {

	public static void main(String[] args) {
		
	int[] arr1= {3,2,11,4,6,7};
	int[] arr2= {1,2,8,4,9,7};
	for(int i=0;i<arr1.length;i++)
	{
		for(int k=0;k<arr2.length;k++)
		{
		if(arr1[i]==arr2[k])
		{
			System.out.println("The intersection number of the two arrays are");
			System.out.println(arr2[k]);
}
		}
	}
  }
}