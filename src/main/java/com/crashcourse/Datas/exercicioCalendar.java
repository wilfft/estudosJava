package com.crashcourse.Datas;

import java.util.Calendar;

public class exercicioCalendar {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Calendar boleto = Calendar.getInstance();
	Calendar vencimento = Calendar.getInstance();
	int vencCalendar = boleto.DAY_OF_WEEK;
	System.out.println("DAY_OF_WEEK: " + vencCalendar);
	System.out.println("Data vencimento: " + vencimento.getTime());

	System.out.println("Data get Date: " + Calendar.DAY_OF_WEEK);
	vencimento.add(Calendar.DATE, 10);
	System.out.println("Data boleto: " + boleto.getTime());
	System.out.println("Data vencimento: " + vencimento);

	System.out.println("DAY_OF_WEEK: " + vencCalendar);
	System.out.println("Data get Date: " + vencimento.getTime());
	if (vencimento.after(boleto)) {
	    System.out.println("Boleto vencido");
	    if (vencimento.getTime().getDate() == 6 || vencimento.getTime().getDate() == 7) {
		System.out.println("O juros erá aplicado no proximo dia util");
	    }
	} else {
	    System.out.println("JUROS APLICADO");

	}
    }
}
