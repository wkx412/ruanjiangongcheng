package com.oracle.demo01;

public class Demo01 {
	public static void maPx(int arr[]){
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				int m=arr[j];
				if(m>arr[j+1]){
					arr[j]=arr[j+1];
					arr[j+1]=m;
				}
			}
		}
	}
}
