package kr.co.infopub.chap034.java7;
import java.util.Scanner;
public class SevenSwitch {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		switch(s){
			case "school": System.out.println("학교");break;
			case "car": System.out.println("자동차");break;
			case "map": System.out.println("지도");break;
			default: System.out.println("기타...");break;
		}
		scan.close();
	}
}
