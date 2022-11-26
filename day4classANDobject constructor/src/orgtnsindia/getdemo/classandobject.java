package orgtnsindia.getdemo;

import java.util.Scanner;

public class classandobject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the speed of the car:");
		int speed=s.nextInt();
		
		//creation of object
		car x=new car();
		//compile time input
		//x.speed=45;
		x.speed(speed);
		s.close();

	}

}
