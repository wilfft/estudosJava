package com.crashcourse.Datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataFormato {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Date data = new Date();
	String dataString = DateFormat.getInstance().format(data);
	System.out.println(dataString);
	String dataString2 = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG).format(data);
	String dataString3 = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(data);
	System.out.println(dataString2);
	System.out.println(dataString3);

	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy ");

	SimpleDateFormat formatterEx = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:SSSS");
	System.out.println(data);
	String resolucao = formatterEx.format(data);
	String formatado = formatter.format(data);
	System.out.println("FORMATADO " + resolucao);

    }

}
