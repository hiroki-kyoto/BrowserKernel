package net.token.grace;

public class Encoding {
	public static String Ĭ�� = "utf-8";
	public static String ͨ�� = "unicode";
	public static String ���� = "GBK";
	public static String �������� = "GB2312";
	public static String �������� = "Big5";
	
	public static String setHTMLEncodingType(String htmlContent, String type){
		htmlContent = htmlContent.replace("charset=", "charset=" + type + "  ");
		return htmlContent;
	}
}
