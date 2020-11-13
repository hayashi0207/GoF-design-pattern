package com.example;

//継承版
//public class PrintAdapter extends Show implements Print{
//	public void printStr(String str) {
//		System.out.println("=========");
//		showStr(str);
//		System.out.println("=========");
//	}
//	public void printNumber(int value) {
//		System.out.println("---------");
//		showNumber(value);
//		System.out.println("---------");
//	}
//}

//委譲版
public class PrintAdapter implements Print{
	Show show;
	public PrintAdapter() {
		super();
		show = new Show();
	}
	public void printStr(String str) {
		System.out.println("==========");
		show.showStr(str);
		System.out.println("==========");
	}
	public void printNumber(int value) {
		System.out.println("----------");
		show.showNumber(value);
		System.out.println("----------");
	}
}

