package kr.co.infopub.chap034.java7;
import java.util.Scanner;
public class SevenSwitch {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		switch(s){
			case "school": System.out.println("�б�");break;
			case "car": System.out.println("�ڵ���");break;
			case "map": System.out.println("����");break;
			default: System.out.println("��Ÿ...");break;
		}
		scan.close();
	}
}
