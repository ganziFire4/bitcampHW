package team4_study;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	//static으로 선언한 이유는 main에서 객체를 생성하고, 사용하기 위해서 
	public static Scanner sc = new Scanner(System.in);
	//사용자의 입력을 읽기 위해 Scanner 추가
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		// local 변수 boolean 선언
		boolean run = true;
		while(run) {
			System.out.println("------------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = sc.nextInt(); //public static Scanner아닐 시 오류 나는 이유 물어보기
			
			if(selectNo == 1) {
				
			} else if(selectNo == 2) {
				
			} else if(selectNo == 3) {
				
			} else if(selectNo == 4) {
				
			} else if(selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
		
	}
	
}
