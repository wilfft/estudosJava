package com.crashcourse.Datas;

import java.util.Calendar;

public class ExCalendar {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	Calendar agora = Calendar.getInstance();

	System.out.println(agora.getTime());
	System.out.println("date " + agora.DATE);
	agora.add(Calendar.DATE, 8);
	System.out.println("depois de add " + agora.getTime().getDate());
	System.out.println("date " + agora.DATE);
	// agora.add(Calendar.MONTH, 4);
	// agora.add(Calendar.YEAR, 2);
	System.out.println(agora.getTime());

	if (agora.getTime().getDate() == 7) {
	    System.out.println("DOMINGO");

	}
	System.out.println("DAY_OF_WEEK:" + agora.DAY_OF_WEEK);
	System.out.printf("TC  %tc\n", agora);
	System.out.printf("tD %tD\n", agora);

	System.out.printf("tF  %tF\n", agora);

	System.out.printf("tr  %tr\n", agora);

	System.out.printf("tT  %tT\n", agora);
    }

}
