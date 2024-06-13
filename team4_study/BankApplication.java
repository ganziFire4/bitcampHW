package team4_study;

import java.util.Scanner;

public class BankApplication {
	
	private static Account[] accountArray = new Account[100];
	//static으로 선언한 이유는 main에서 객체를 생성하고, 사용하기 위해서 
	private static Scanner sc = new Scanner(System.in);
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//사용자의 입력을 읽기 위해 Scanner 추가		
		// local 변수 boolean 선언
		boolean run = true;
		while(run) {
			System.out.println("------------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {
				createAccount();
				//메인 메소드에서 호출했기 때문에 static 메소드여야 함.
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				veiwDeposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
		
	}
		// 매개변수에 스캐너 넣는방법 찾아보기
		private static void withdraw() {
			// TODO Auto-generated method stub
			
		}

		private static void veiwDeposit() {
			// TODO Auto-generated method stub
			System.out.println("-------------");
			System.out.println("예금");
			System.out.println("-------------");
			System.out.println("계좌번호");
			System.out.println("예금액");
			int money = sc.nextInt();
			
			Account account = findAccount(ano);
			
			
		}

		
		
		
		private static void accountList() {
			// TODO Auto-generated method stub
			System.out.println("-------------");
			System.out.println("계좌목록");
			System.out.println("-------------");

			for(int i = 0; i < accountArray.length; i++) {
				Account account = accountArray[i];
				if(account != null) {
					System.out.print(account.getAno());
					System.out.print("	");
					System.out.print(account.getOwner());
					System.out.print("	");
					System.out.print(account.getBalance());
					System.out.println();
					
				}
			}
		}

		private static void createAccount() {
			// TODO Auto-generated method stub
			
			
			System.out.println("-------------");
			System.out.println("계좌생성");
			System.out.println("-------------");
			
			System.out.print("계좌번호: ");
			String ano = sc.next();
			
			System.out.print("계좌주: ");
			String owner = sc.next();
			
			System.out.print("초기입금액: ");
			int balance = sc.nextInt();
			
			Account newAccount = new Account(ano, owner, balance);
			// 배열의 내용이 null인 곳에 저장
			
			for(int i = 0; i < accountArray.length; i++) {
				if(accountArray[i] == null) {
					accountArray[i] = newAccount;
					System.out.println("결과: 계좌가 생성되었습니다.");
					break;
				}
			}
			
			
		}
	
}