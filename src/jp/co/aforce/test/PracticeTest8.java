package jp.co.aforce.test;

public class PracticeTest8 {

	//練習問題１
	public void printHelo() {
		System.out.println("Heloo");
	}
	//練習問題２
	public void printRandomMessage() {
		int n = (int)(3*Math.random());

		switch (n){
		case 0:
			System.out.println("こんばんは");

		case 1:
			System.out.println("こんにちは");

		default:
			System.out.println("おはよう");
		}
	}

	//練習問題３
	String printMessage(String message) {
		System.out.println(message);
		return message;
	}

	//練習問題４
	void printMessage(String message, int count) {
		for(int i = 1; i < count; i++) {
			System.out.println(message);
		}
	}

	//練習問題５
	void printRectangleArea(double height,double width) {
		double squea = height * width;
		System.out.println(squea);
	}

	//練習問題６
	String getWeatherForecast() {
		int n = (int)(3*Math.random());
		int z = (int)(4*Math.random());

		String day;
		String weather;

		if(n == 0) {
			day ="今日";
		}else if(n == 1) {
			day = "明日";
		}else {
			day = "昨日";
		}

		if(z == 0) {
			weather = "晴れ";
		}else if(z == 1) {
			weather = "雨";
		}
		else if(z == 2) {
			weather = "曇り";
		}else {
			weather = "雪";
		}
		return day + "の天気は" + weather + "でしょう";
	}

	//練習問題７
	boolean isEvenNumber(int value) {
		if(value % 2 == 0) {
			return true;
		}else {
			return false;
		}
	}

	//練習問題８
	String getMessage(String name,boolean isKid) {
		if(isKid = true) {
			return "こんにちは" + name + "ちゃん";
		}else{
			return "こんにちは" + name + "さん";
		}
	}

	//練習問題９
	public String getLongestString(String[] array) {
		int number = array.length;
		return max(number);

	}
	private String max(int number) {
		return null;
	}
	//練習問題１０

	boolean isAdult(Person person) {
		int personAge = person.getAge();

		if(personAge >=20) {
			return true;
		}else {
			return false;
		}
	}

}
