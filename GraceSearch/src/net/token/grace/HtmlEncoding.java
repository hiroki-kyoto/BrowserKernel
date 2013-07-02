package net.token.grace;

public class HtmlEncoding {
	//when forget to set the encoding type , use the default one. 
	private String encodeType = Encoding.д╛хо;
	//method to modify and get the encoding type;
	public String getEncoding(){
		return encodeType; 
	}
	
	public void setEncoding(String encode){
		encodeType = encode;
	}
}
