package net.token.grace;

import java.util.Vector;

public class CheckOverDown {
	//the static collection of urls once crawled:
	private static Vector<String> EverUrl = new Vector<String>();
	
	//check if the url has been crawled:
	public static boolean isCrawled(String u){
		boolean flag = false;
		for(String i : EverUrl){
			if(i.equals(u)){flag = true;}
		}
		return flag;
	}
	
	//add the crawled url to the EverUrl Vector:
	public static void markAsCrawled(String u){
		EverUrl.addElement(u);
	}
}
