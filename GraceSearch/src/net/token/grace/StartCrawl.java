package net.token.grace;

public class StartCrawl {
	public static void main(String[] args){
		Thread t = new WebCrawler("http://www.ziqiang.net", Encoding.中文);
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long tick = System.currentTimeMillis();
		while(System.currentTimeMillis()-tick<1000000){
			Thread t1 = new WebCrawler(Encoding.中文);
			t1.start();
		}
	}
}
