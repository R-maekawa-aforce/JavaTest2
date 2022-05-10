package jp.co.aforce.test;

public class Main {

	public static void main(String[] args) {
		PracticeTest8 practice =new PracticeTest8();

		practice.printHelo();
		practice.printRandomMessage();
		practice.printMessage("hello");
		practice.printMessage("hello", 3);
		practice.printRectangleArea(1.2, 1.5);
		String b = practice.getWeatherForecast();

		System.out.println(b);
		practice.isEvenNumber(4);

		 String a = practice.getMessage("前川", true);
		 System.out.println(a);

		practice.getLongestString(args);
		practice.isAdult(null);
	}

}
