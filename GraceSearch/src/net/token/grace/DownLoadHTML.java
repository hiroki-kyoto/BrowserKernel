package net.token.grace;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Vector;

final class DownLoadHTML {
	public static Vector<String> down(String url, String path, String EncodingType) throws IOException{
		String html = UrlLoader.load(url);
		if(html==null){return null;}
		//System.out.print(html);
		File f = new File(path+".htm");
		
		String instr = Encoding.setHTMLEncodingType(html, EncodingType);
		//get the childrenLinks:
		Vector<String> childUrl = UrlAnalyzer.getChildUrl(instr, url); 
		
		FileWriter fw = new FileWriter(f);
		fw.write(instr);
		fw.close();
		return childUrl;
		//save the html to png:
		//HtmlShot.getWebShot(url, path + ".png");
		//end save
	}
	public static void down2(String url, String path)throws IOException{
		try {
			File f = new File(path);
			StringBuffer sb = new StringBuffer("");
			URL u = new URL(url);
			Object content = u.getContent();
			InputStream is = (InputStream)content;
			byte[] b = new byte[256];
			int n = is.read(b);
			while(n!=-1){
				sb.append(new String(b,0,n));
				n = is.read(b);
			}
			FileWriter fr = new FileWriter(f);
			fr.write(sb.toString());
			fr.close();
			is.close();
		} catch (MalformedURLException e) {
			// TODO if the url is wrong, this exception will block the thread.
			e.printStackTrace();
		}
	}
}
