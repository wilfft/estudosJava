package com.crashcourse.Datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class localData {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	LocalDate hoje = LocalDate.now();
	System.out.println(hoje);
	LocalDate semanaPassada = hoje.minusDays(7);
	System.out.println(semanaPassada);
	LocalTime agora = LocalTime.now();
	System.out.println(agora);
	LocalTime maisUmaHora = agora.plusHours(5);
	System.out.println(maisUmaHora);

	LocalDateTime ldt = LocalDateTime.now();
	System.out.println(ldt);
	LocalDateTime futuro = ldt.plusHours(2).plusDays(4).plusSeconds(30);
	System.out.println(futuro);
    }

}
