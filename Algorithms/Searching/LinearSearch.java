//Linear search is worst case for searching

import java.util.*;

public class LinearSearch
{   
    static int search(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    
	public static void main(String[] args) {
		int arr[]={8,0,7,2,6,4,5,1};
		int target=1;
		System.out.println("Array: "+Arrays.toString(arr));
		int index=search(arr,target);
		if(index==-1){
		    System.out.println("Target Not found!");
		}
		else{
		    System.out.println(target+" is present in "+index+" th index");
		}
	}
}