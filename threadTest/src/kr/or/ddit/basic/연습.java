package kr.or.ddit.basic;

import java.util.ArrayList;
import java.util.List;

public class 연습 {
public static void main(String[] args) {
	
	List<String> bar = new ArrayList<>();
	for(int i=0; i<=50; i++) {
		bar.add("-");
	}
	
	bar.set(10, ">");
	for(String b : bar) {
		System.out.print(b);
	}
	
	System.out.println(bar.get(1));
}
}
