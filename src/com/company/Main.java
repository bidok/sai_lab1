package com.company;


public class Main {


    public static void main(String[] args) {
		move('A', 'B', 'C', 3);
	}
		public static void move(char a, char b, char c, int count) {
			if (count == 1) {
				System.out.println(String.format("%s => %s",a,c));
			} else {
				move(a, c, b, count - 1);
				System.out.println(String.format("%s => %s",a,c));
				move(b,a,c,count-1);
			}
		}


}
