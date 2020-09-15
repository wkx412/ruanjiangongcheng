package com.oracle.demo01;

public class Demo01 {
	public static void main(String[] args){
		int arr[] ={1,5,6,4,9,95,15};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1-i;j++){
				int m=arr[j];
				if(m>arr[j+1]){
					arr[j]=arr[j+1];
					arr[j+1]=m;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
