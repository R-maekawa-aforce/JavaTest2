package jp.co.aforce.test;

public class Employee {
	//練習問題３
	private String number1 = "1";
	private String number2 = "2";
	private String number3 = "3";

	private String name1 = "田中太郎";
	private String name2 = "佐藤花子";
	private String name3 = "鈴木次郎";

	private String gender1 = "男性";
	private String gender2 = "女性";
	private String gender3  = "男性";

	private String age1 = "27";
	private String age2 = "22";
	private String age3 = "31";

	String[] getTanaka() {
		String []tanakas = {number1,name1,gender1,age1};

		return tanakas;
	}

	String[] getSatou() {
		String []satous = {number2,name2,gender2,age2};

		return satous;
	}
	String[] getSuzuki() {
		String []suzukis = {number3,name3,gender3,age3};

		return suzukis;
	}
}