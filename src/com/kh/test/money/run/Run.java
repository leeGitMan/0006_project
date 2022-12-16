package com.kh.test.money.run;


import com.kh.test.money.model.vo.Money;

public class Run {

	
	public static void main(String[] args) {
		
		
		Money asd = new Money();
		
		asd.setMoney(10000);
		System.out.println(asd.getMoney() + asd.UNIT);
		System.out.println(asd.UNIT);
		
		asd.setMoney(12031237);
		System.out.println(asd.getMoney() + asd.UNIT);
		
		asd.setMoney(12034);
		System.out.println(asd.getMoney() + asd.UNIT);
		
		asd.setMoney(100000000);
		System.out.println(asd.getMoney() + asd.UNIT);
	}
}
