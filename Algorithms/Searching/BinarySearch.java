//BinarySearch is Best case for searching

import java.util.*;

public class BinarySearch
{   
    static int search(int arr[],int target){
        int left=0,right=arr.length-1;
        while(left<=right){
            int mid=(right+left)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }
    
	public static void main(String[] args) {
		int arr[]={8,0,7,2,6,4,5,1};
		int target=0;
		Arrays.sort(arr);
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