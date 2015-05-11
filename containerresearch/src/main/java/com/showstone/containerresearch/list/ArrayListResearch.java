package com.showstone.containerresearch.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayListResearch {
	
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		for(int i=0;i<100000;i++){
			ArrayList list = new ArrayList();
			for(int num=0;num<1000;num++){
				list.add("object");
			}
		}
		System.out.println("用时:"+ (System.currentTimeMillis()-startTime)+"毫秒");
		startTime = System.currentTimeMillis();
		for(int i=0;i<100000;i++){
			ArrayList list = new ArrayList(2000);
			for(int num=0;num<1000;num++){
				list.add("object");
			}
		}
		System.out.println("用时:"+ (System.currentTimeMillis()-startTime)+"毫秒");
	}
	
}

