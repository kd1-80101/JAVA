package com.sunbeam;

public class TestorMain {

	public static void main(String[] args) {
		Manager m1 = new Manager(25000.2, 1556.231);
		System.out.println("m1.getSal() :" + m1.getSal()); // m1.getSal() :26556.431
		System.out.println("m1.calcIncentives() :" + m1.calcIncentives()); // m1.calcIncentives() :5000.040000000001

		Manager m2 = new Manager(25000.2, 1556.231);
		System.out.println("m2.getSal() :" + m2.getSal()); // m2.getSal() :26556.431
		System.out.println("m2.calcIncentives() :" + m2.calcIncentives()); // m2.calcIncentives() :5000.040000000001

		Labor l1 = new Labor(700, 41.56);
		System.out.println("l1.getSal() :" + l1.getSal()); // l1.getSal() :1727.2336000000003
		System.out.println("l1.calcIncentives() :" + l1.calcIncentives());// l1.calcIncentives() :86.36168000000002

		Labor l2 = new Labor(200, 41.56);
		System.out.println("l2.getSal() :" + l2.getSal());// l2.getSal() :1727.2336000000003
		System.out.println("l2.calcIncentives() :" + l2.calcIncentives()); // l2.calcIncentives() :1727.2336000000003

		Clerk c1 = new Clerk(1332.21);
		System.out.println("c1.getSal() :" + c1.getSal());// c1.getSal() :1332.21
		System.out.println("c1.calcIncentives() :" + c1.calcIncentives());// c1.calcIncentives() :0.0

		Clerk c2 = new Clerk(35152.21);
		System.out.println("c2.getSal() :" + c2.getSal());// c2.getSal() :35152.21
		System.out.println("c2.calcIncentives() :" + c2.calcIncentives());// c2.calcIncentives() :0.0

	}

}
