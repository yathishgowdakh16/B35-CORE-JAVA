package orgtnsindia.getdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Demo on BufferedReader class
public class BUFFERREADERDemo {

	public static void main(String[] args) throws IOException {
		BufferedReader b=new BufferedReader(new
				InputStreamReader(System.in));
		String name=b.readLine();
		System.out.println(name);

	}

}
