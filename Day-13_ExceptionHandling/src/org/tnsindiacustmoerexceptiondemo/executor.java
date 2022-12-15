package org.tnsindiacustmoerexceptiondemo;

import java.util.Scanner;

public class executor {

	public static void main(String[] args) throws LogicalCredentials {
		Scanner s=new Scanner(System.in);
		String id=s.nextLine();
		String password=s.nextLine();
		//validating
		if(id!="ygowda@tnsif.org" && password!="123abc")
		{
			throw new LogicalCredentials(id, password);
		}
		
			

	}

}
