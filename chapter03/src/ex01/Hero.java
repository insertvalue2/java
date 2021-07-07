package ex01;

import java.util.Scanner;

public class Hero {

	String name;
	int hp;

	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	public void attack() {
		System.out.println(" 기본 공격 ");
	}
}
