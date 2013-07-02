package net.token.grace;

public class PageName {
	private static long pageCount = 0;
	public static String getPageName(){
		pageCount++;
		return "t" + pageCount;
	}
}
