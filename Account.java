package chap00_practice;

import java.util.Scanner;

public class Account {
	public int balance;
	public String accountNum;
	public String accountName;
	public int initDeposit;
	
	public Account() {
		
	}
	
	public Account(String accountNum, String accountName, int initDeposit) {
		this.accountNum = accountNum;
		this.accountName = accountName;
		this.balance = initDeposit;
	}
	
	public int getBalance() {
		return balance;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public String getAccountName() {
		return accountName;
	}

	public int getInitDeposit() {
		return initDeposit;
	}
	
	public void createAccount(Account[] accounts, int count) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------");
		System.out.println("계좌생성");
		System.out.println("-------------");
		
		System.out.println("계좌번호");
		accountNum = sc.nextLine();
		System.out.println("계좌주");
		accountName = sc.nextLine();
		System.out.println("초기 입금액");
		initDeposit = balance + sc.nextInt();
		
		if(accountNum != null && accountName != null && initDeposit > 0) {
			accounts[count] = new Account(accountNum, accountName, initDeposit);
			System.out.println("결과 : 계좌가 생성되었습니다.");
		}
	}

	public void accountList(Account[] accounts, int count) {
		System.out.println("계좌목록");
		System.out.println("-------------");
		
		for(int i = 0; i < count; i++) {
			System.out.println("계좌번호: " + accounts[i].getAccountNum() + 
					", 계좌주: " + accounts[i].getAccountName() + ", 잔액: " 
					+ accounts[i].getBalance());
		 }
	}
	
	public void deposit(Account[] accounts, int count) {
		Scanner sc = new Scanner(System.in);
		System.out.println("예금");
		System.out.println("-------------");
		System.out.println("계좌번호: ");
		String num = sc.nextLine();
		System.out.println("예금액 : ");
		int money = sc.nextInt();
		for(int i = 0; i < accounts.length; i++) {
			if(num.equals(accounts[0].accountNum)) {
				if(money > 0) {
					accounts[0].balance += money;
					
				} else
					System.out.println("입금이 실패하였습니다.");
			} else {
				System.out.println("계좌를 찾지 못했습니다.");
			}
		}
	}
	
	public void withdraw() {
		System.out.println("출금");
		System.out.println("-------------");
		// 출금 처리 로직
		System.out.println("결과 : 출금이 성공되었습니다.");
	}
}
