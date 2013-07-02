package net.token.grace;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class TokenListener {
	public void downHtml2(String[] args)throws IOException{
		try {
			File f = new File("download.htm");
			StringBuffer sb = new StringBuffer("");
			URL url = new URL("http://localhost:82");
			Object content = url.getContent();
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
	public void downHtml(String url, String path) throws IOException{
		File f = new File(path);
		URL u = new URL(url);
		StringBuffer sb = new StringBuffer("");
	    InputStream ins = u.openStream();
	    InputStreamReader insr = new InputStreamReader(ins);
	    BufferedReader br = new BufferedReader(insr);
	    String tmp = br.readLine();
	    while(tmp!=null){
	    	sb.append(tmp);
	    	tmp = br.readLine();
	    }
	    FileWriter fw = new FileWriter(f);
	    fw.write(sb.toString());
	    br.close();
	    ins.close();
	    insr.close();
	    fw.close();
	}
}
