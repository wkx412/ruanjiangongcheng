package com.oracle.demo01;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class Demo01Test {
	
	@Test

	public void test() {
		int[] arr={2,5,8,11,54};
		Demo01.maPx(arr);
		System.out.println(Arrays.toString(arr));
	}

}
