package com.showstone.containerresearch.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class LinkedListStudy {

	public static void main(String[] args) {
		List<String> ls = new LinkedList<String>();
		long startTime = System.currentTimeMillis();
		for(int idx=0;idx<10000000;idx++){
			ls.add(idx+"");
		}
		System.out.println("生成用时：" + (System.currentTimeMillis()-startTime));
		startTime = System.currentTimeMillis();
		ls.get(50000);
		System.out.println("查询用时：" + (System.currentTimeMillis()-startTime));
		
		System.out.println("-----------------");
		ls = new ArrayList<String>();
		startTime = System.currentTimeMillis();
		for(int idx=0;idx<10000000;idx++){
			ls.add(idx+"");
		}
		System.out.println("生成用时：" + (System.currentTimeMillis()-startTime));
		startTime = System.currentTimeMillis();
		ls.get(50000);
		System.out.println("查询用时：" + (System.currentTimeMillis()-startTime));
	}
	
	
}
