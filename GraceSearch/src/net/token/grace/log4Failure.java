package net.token.grace;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class log4Failure {
	public static void log(String url) throws IOException{
		String failPath = "log/failure.txt";
		File f = new File(failPath);
		FileWriter fw = new FileWriter(f);
		fw.append(url);
		fw.close();
	}
}
