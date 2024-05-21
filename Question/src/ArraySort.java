import java.util.Scanner;
import java.util.Arrays;
public class ArraySort {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a;    
        System.out.println("enter  number of elements :");
        a=sc.nextInt();    
        
        int arr[]=new int[a];  
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<a;i++)   
        {
            arr[i]=sc.nextInt();
        }
 
        int temp = 0;    
        
        for (int i = 0; i < arr.length; i++)   
        {     
           for (int j = i+1; j < arr.length; j++)    
           {     
              if(arr[i] < arr[j]) 
              {    
                  temp = arr[i];    
                  arr[i] = arr[j];    
                  arr[j] = temp;    
              }     
           }     
       } 
        for (int i = 0; i < arr.length; i++) 
        {  
        System.out.println(arr[i]);
        }
        
//        Arrays.sort(arr);    5
//        System.out.printf("Sorted arr[] : %s",
//                          Arrays.toString(arr)); 
        
//        public static void main(String[] args) {
//
//    		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
//
//    		for (int index = 0; index < a.length; index++) {
//    			System.out.println(a[index]);
//    		}
//    		Scanner sc = new Scanner(System.in);
//    		System.out.println("enter array of element");
//    		int arr = sc.nextInt();
//    		int size[] = new int[arr];
//
//    		for (int index = 0; index < size.length; index++) {
//    			System.out.print("[" + index + "] : ");
//    			size[index] = sc.nextInt();
//    		}
//    		int sum=0;
//    		for(int index=0;index<size.length;index++)
//    		{
//    			 sum=sum+size[index];
//    		}
//    		System.out.println("sum of array is "+sum );
//    	}
        
    }
}
