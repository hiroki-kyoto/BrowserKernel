package net.token.grace;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class UrlLoader {
	public static String load(String url) throws IOException{
		if(url==null){return null;}
		try{
		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
		conn.addRequestProperty("User-Agent", "Mozilla/4.0(compatible;MSIE 7.0;Windows NT 5.1;Maxthon;) Googlebot, Baiduspider, YodaoBot");
		//conn.setRequestProperty("Accept-Encoding", "gzip,deflate,sdch");
		conn.setRequestProperty("referer", UrlAnalyzer.getReferer(url));
		conn.setRequestProperty("cookie", UrlAnalyzer.getReferer(url));
		
		StringBuffer sb = new StringBuffer("");
		InputStream ins = conn.getInputStream();
		InputStreamReader insr = new InputStreamReader(ins, "utf-8");
		BufferedReader br = new BufferedReader(insr);
		String tmp = br.readLine();
		while(tmp!=null){
			sb.append(tmp);
			tmp = br.readLine();
			//System.out.println(tmp);
		}
		//System.out.print(sb.toString());
		return sb.toString();
		}
		catch(Exception e){
			log4Failure.log(url);
			e.printStackTrace();
			return null;
		}
	} 
}
