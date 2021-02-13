package com.crashcourse.Loiane.wrappers;

public class testaWrapper {

    public static void main(String[] args) {
	short num1 = 2;
	Short num2 = new Short((short) 2);

	int num3 = 1;
	Integer num4 = new Integer(1);

	num2 = num4.shortValue();

    }

}
