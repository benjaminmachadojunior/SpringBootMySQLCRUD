package com.developer.SpringMySQLteste.controllers;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

public class GetMac {

	String ma=null;
	String teste = "127.0.0.1";
	
	public String getMacs() throws UnknownHostException, SocketException{
		//retorna nome do computador e ip local 
		InetAddress address = InetAddress.getLocalHost();
		//Inet6Address ads = Inet6Address.getLoopbackAddress();
//		System.out.println(address);
		
		//imprime a placa de rede que tem internet no momento
		NetworkInterface ni= NetworkInterface.getByInetAddress(address);
	//	System.out.println(ni);
		
		//GET MAC ADDRESS FROM THE NETWORK INTERFACE IN BYTE
		byte[]mac=ni.getHardwareAddress();
		//System.out.println(mac);
		
		for(int j=0;j<mac.length;j++) {
	//	System.out.println(mac[j]);
		}
		
		//display the mac address
		
		StringBuilder sb=new StringBuilder();
		//brouser the mac address  to convert in onto string
		
		for(int i=0;i<mac.length;i++) {
			
			sb.append(String.format("%02X%s", mac[i],(i<mac.length-1)?"-":""));
			}
		ma=sb.toString();
			
		return ma;
	}
	
//	public static void main(String[] args) throws UnknownHostException, SocketException {
		
//		GetMac gm = new GetMac();
//		String mac = gm.getMacs();
//		System.out.println(mac);
//		System.out.println("00-1F-3B-D4-E3-73");
//		if (mac.equals("00-1F-3B-D4-E3-73")) {
//		System.out.println("igual");
//		}else {
//		System.out.println("diferente");
//		}
		
}
