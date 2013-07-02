package net.token.grace;

import java.io.IOException;
import java.util.Vector;

public class WebCrawler extends Thread{
	private static String url = "http://www.iteye.com/problems/91564";
	private static String encodeType = Encoding.中文;
	private static Vector<String> waitLine = new Vector<String>();
	
	public WebCrawler(String e){
		encodeType = e;
	}
	public WebCrawler(String u, String e){
		url = u;
		encodeType = e;
	}
	
	@Override
	public void run(){
		//test the download speed:
		long milli = System.currentTimeMillis();
		try {
			Vector<String> w = DownLoadHTML.down(next(), PageName.getPageName(), encodeType);
			if(w!=null){waitLine.addAll(w);}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long cur_milli = System.currentTimeMillis();
		System.out.println("用时：" + (cur_milli - milli) + "毫秒");
	}
	
	//get the next waiting url to crawl:
	public static String next(){
		if(IsFirstStart.isFirstStart()){
			IsFirstStart.markNotFirst(); 
			CheckOverDown.markAsCrawled(url); 
			return url;
		}
		if(waitLine.size()==0){return null;}
		//delete the url from the queen:
		String first = waitLine.remove(0);
		if(!CheckOverDown.isCrawled(first)){
			CheckOverDown.markAsCrawled(first);
			return first;
		}
		else{return next();}
	}
	public static boolean isEmpty(){
		if(waitLine.size()==0){return true;}
		return false;
	}
}
