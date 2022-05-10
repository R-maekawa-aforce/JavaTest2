package jp.co.aforce.test;

import java.util.HashMap;
import java.util.Map.Entry;

public class PracticeTest3 {

	public static void main(String[] args) {

		//練習問題１
		String[]tanaka = {"1","田中太郎","男性","27"};

		//練習問題２
		System.out.println(tanaka[1]);

		//練習問題４
		Employee employee = new Employee();

		String[] tanakaData = employee.getTanaka();
		String[] satouData = employee.getSatou();
		String[] suzukiData = employee.getSuzuki();

		String [][]allMember = {tanakaData, satouData, suzukiData};


		for(String[]member:allMember) {
		System.out.println("番号は" + member[0] + "、名前は" + member[1] + "、年齢は" + member[3] + "歳です");
		}

		//練習問題５
		HashMap<String, String> subject = new HashMap<>();
		subject.put("国語","90点");
		subject.put("数学","80点");
		subject.put("英語","65点");


		for(Entry<String, String> entry : subject.entrySet()) {
		System.out.println(entry.getKey() + ":" + entry.getValue());
		}

		//練習問題６
		//キーと要素に分けることができ、配列やリストより簡潔にコードが書けると思ったから

	}

}
