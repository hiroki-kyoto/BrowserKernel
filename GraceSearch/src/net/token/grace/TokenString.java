package net.token.grace;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TokenString {
	private String s;

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}
	
	public TokenString(){ s= null; }
	
	public TokenString(String _s){
		s = _s;
	}
	
	public void flush(){
		s = null;
	}
	
	public void saveAsFile(String path)throws IOException{
		File f = new File(path);
		FileWriter fw = new FileWriter(f);
		fw.write(s);
		fw.close();
	}
}
