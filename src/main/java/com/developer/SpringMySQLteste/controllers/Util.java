package com.developer.SpringMySQLteste.controllers;

import java.net.SocketException;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.springframework.boot.SpringApplication;

import com.developer.SpringMySQLteste.SpringMySqlApplication;
import com.developer.SpringMySQLteste.controllers.GetMac;


public class Util {
	
//	static SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	
	public static String getDataConsulta() throws Exception {

		String data = null;
		String server = "00-1F-3B-D4-E3-73";
		
		Calendar user = new GregorianCalendar(2020, Calendar.MAY, 23);//informando a data
		Calendar now = new GregorianCalendar();
		//user.before(now);//retorna true se a data informada acima for anterior a data atual
		
		GetMac gm = new GetMac();
		String mac = gm.getMacs();
		
		if(!user.before(now) && mac.equals(server)){ //verifica data de vencimento e mac do servidor
//		if(!user.before(now)){
//		if(mac.equals(server)){

			data = "index";
			System.out.println(server);
		} else {
				data = "validacao";
				System.out.println(server);
			}
		System.out.println("SE A LICENÇA TIVER OK INDEX SENAO VALIDACAO = "+data);
		return data;
	}
//	public static void main(String[] args) throws UnknownHostException, SocketException {
		
//System.out.println("teste");

//}

}