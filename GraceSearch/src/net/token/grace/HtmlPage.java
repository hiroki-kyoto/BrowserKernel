package net.token.grace;

import java.util.Vector;

//每个需要精确结果的方法必须有相应的测试接口
public class HtmlPage {
	//set those data Items;
	public HtmlHref HREF;
	public HtmlEncoding ENCODING;
	public HtmlMedia MEDIA;
	public HtmlText TEXT;
	public HtmlTitle TITLE;
	//public method to get initial the dataItems.
	public HtmlPage(String h){
		//extract the hrefs:
		HREF.setHref(getHrefs(h));
		//extract the encoding:
		
	}
	public Vector<String> getHrefs(String html){
		Vector<String> Hrefs = new Vector<String>();
		Vector<Integer> hrefIndexs = new Vector<Integer>();
		int hreftmp = html.indexOf("href=");
		while(hreftmp!=-1){
			hrefIndexs.addElement(hreftmp);
			hreftmp = html.indexOf("href=", hreftmp);
		}
		for(int i=0; i<hrefIndexs.capacity(); i++){
			int end = html.indexOf("\"", hrefIndexs.elementAt(i));
			Hrefs.addElement(html.substring(hrefIndexs.elementAt(i)+5, end));
		}
		return Hrefs;
	}
}
