package jp.co.aforce.test;

public class Main {

	public static void main(String[] args) {
		PracticeTest8 practice =new PracticeTest8();

		practice.printHelo();
		practice.printRandomMessage();
		practice.printMessage("ya");
		practice.printMessage("hello", 2);
		practice.printRectangleArea(1.2, 1.5);

		System.out.println(practice.getWeatherForecast());

		System.out.println(practice.isEvenNumber(4));

		System.out.println(practice.getMessage("前川", false));

		Person person = new Person(null, 21);
		System.out.println(practice.isAdult(person));
	}

}
