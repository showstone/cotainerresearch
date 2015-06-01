package com.showstone.containerresearch.list;

import java.util.ArrayList;

public class ArrayListResearch {
	
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		for(int i=0;i<100000;i++){
			ArrayList<String> list = new ArrayList<String>();
			for(int num=0;num<1000;num++){
				list.add("object");
			}
		}
		System.out.println("用时:"+ (System.currentTimeMillis()-startTime)+"毫秒");
		startTime = System.currentTimeMillis();
		for(int i=0;i<100000;i++){
			ArrayList<String> list = new ArrayList<String>(2000);
			for(int num=0;num<1000;num++){
				list.add("object");
			}
		}
		System.out.println("用时:"+ (System.currentTimeMillis()-startTime)+"毫秒");
	}
	
}

