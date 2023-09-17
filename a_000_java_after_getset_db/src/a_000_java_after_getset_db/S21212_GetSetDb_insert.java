package a_000_java_after_getset_db;

import java.util.Scanner;

class people{
	private int hakbun;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;
	private int rank;
	public int cnt;
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return getKor() + getEng() + getMath();
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	void printScore() {
		System.out.printf("%3d %9s %4d %6d %5d %6d %8.2f %4d \n",
				cnt, hakbun, kor, eng, math, getSum(), getAvg(), rank);
	}
}
public class S21212_GetSetDb_insert {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("몇명의 성적처리를 해?");
		int num = input.nextInt();
		
		people stu[] = new people[num];
		
		for(int  i = 0 ; i < stu.length; i ++) {
			
			stu[i] = new people();
			System.out.println("학번입력");
			stu[i].setHakbun(input.nextInt());
			System.out.println("국어점수몇점?");
			stu[i].setKor(input.nextInt());
			System.out.println("영어점수몇점?");
			stu[i].setEng(input.nextInt());
			System.out.println("수학점수몇점?");
			stu[i].setMath(input.nextInt());
		}
		for(int i = 0 ; i < stu.length; i++) {
			int rank = 1;
			for(int j = 0 ; j < stu.length; j++) {
				if(stu[i].getSum() < stu[j].getSum())rank++;
			}
			stu[i].setRank(rank);
		}
		System.out.println("=============출력============");
		System.out.printf(" no      학번     국어    영어  수학  합계    평균    석차\n");
		System.out.println("===========================");
		for(int i = 0 ; i < stu.length; i++) {
			stu[i].cnt = i+1;
			stu[i].printScore();
		}
				
		
	}

}
