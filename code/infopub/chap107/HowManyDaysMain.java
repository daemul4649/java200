package kr.co.infopub.chap107;
public class HowManyDaysMain {

	public static void main(String[] args) {
		HowManyDays how=new HowManyDays();
		System.out.println(how.howManyDays());
		how.setFrom(HowManyDays.makeDay(1975,8,28));
		how.setTo(HowManyDays.makeDay(2013,8,16));
		//����� 1975,8,28~2013,8,16
		System.out.println(how.howManyDays());

	}
}
