package net.token.grace;

import java.awt.Dimension;
import java.io.IOException;
import gui.ava.html.image.generator.HtmlImageGenerator;

public class HtmlShot {
	public static void getWebShot(String url, String path) throws IOException{
	/*
	HtmlImageGenerator imageGenerator = new HtmlImageGenerator();
	//imageGenerator.loadUrl(html);
	Vector<String> cssHref = new Vector<String>();
	Pattern pt = Pattern.compile(" href=\"([\\S.?]+).css\"", Pattern.CASE_INSENSITIVE);
	Matcher mr = pt.matcher(html);
	
	if(mr.find()){
		for(int i=1; i<=mr.groupCount(); i++){
			cssHref.addElement(mr.group(i)+".css");
			System.out.println(mr.group(i)+".css");
		}
		String stylePrefix = "<style type='text/css'>";
		String styleAfter = "</style>";
		StringBuffer css = new StringBuffer("");
		for(int i=0; i<cssHref.size(); i++){
			String cssContent = UrlLoader.load(UrlAnalyzer.getAbsoluteUrl(cssHref.elementAt(i), url));
			//System.out.println(cssContent);
			css.append("\n" + cssContent + "\n");
		}
		html = html.replace("<head>", "<head>"+stylePrefix+css.toString()+styleAfter);
	}
	else {System.out.println("No css files found.");}
	imageGenerator.loadHtml(html);
	imageGenerator.saveAsImage(path);
	//TokenString ts = new TokenString(html);
	//ts.saveAsFile("save.htm");
	 */
		HtmlImageGenerator generator = new HtmlImageGenerator();
		generator.loadUrl(url);
		generator.setSize(new Dimension(1, 1));
		generator.saveAsImage(path);
	}
}
