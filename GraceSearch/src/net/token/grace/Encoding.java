package net.token.grace;

public class Encoding {
	public static String 默认 = "utf-8";
	public static String 通用 = "unicode";
	public static String 中文 = "GBK";
	public static String 简体中文 = "GB2312";
	public static String 繁体中文 = "Big5";
	
	public static String setHTMLEncodingType(String htmlContent, String type){
		htmlContent = htmlContent.replace("charset=", "charset=" + type + "  ");
		return htmlContent;
	}
}
