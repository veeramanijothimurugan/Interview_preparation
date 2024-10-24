//MergeSort is best case for Sorting

import java.util.*;

public class MergeSort
{
    static void sort(int arr[],int left,int right){
        if(left<right){
            int mid=(left+right)/2;
            sort(arr,left,mid);
            sort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }
    
    static void merge(int arr[],int left,int mid,int right){
        int n1=mid-left+1;
        int n2=right-mid;
        
        int a[]=new int[n1];
        int b[]=new int[n2];
        
        for(int i=0;i<n1;i++){
            a[i]=arr[left+i];
        }
        
        for(int j=0;j<n2;j++){
            b[j]=arr[mid+j+1];
        }
        
        int i=0,j=0,k=left;
        
        while(i<n1&&j<n2){
            if(a[i]<=b[j]){
                arr[k]=a[i];
                i++;
            }
            else{
                arr[k]=b[j];
                j++;
            }
            k++;
        }
        
        while(i<n1){
            arr[k]=a[i];
            i++;
            k++;
        }
        
        while(j<n2){
            arr[k]=b[j];
            j++;
            k++;
        }
    }
    
    
	public static void main(String[] args) {
		int arr[]={8,0,7,2,6,4,5,1};
		int left=0;
		int right=arr.length-1;
		System.out.println("Unsorted array:\n"+Arrays.toString(arr));
		sort(arr,left,right);
		System.out.println("Sorted array:\n"+Arrays.toString(arr));
	}
}