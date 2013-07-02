package net.token.grace;

public class IsFirstStart {
	//flag to determine if the first start:
	private static boolean isFirst = true;
	
	//check if the first start:
	public static boolean isFirstStart(){
		return isFirst;
	}
	
	//turn on the switcher to tell the cpu it's not first:
	public static void markNotFirst(){
		isFirst = false;
	}
}
