package org.tnsindiaarraysdemo;

public class Varargs {
	//String ...s is variable -argument and it contain o-n values
		
	public static void print(int a,int b,String ...s)
	
	System.out.println(a+" "+b);
	//to print varargs
	for(int i=0;i<s.length;i++)
	{
		System.out.print(s[i]+"\t");
	}
	
}
	public static void main(String[] args) {
		//fun call
				print(12,25,"Java","SpringBoot","HTML","CSS","JS");
			}

	}
