package org.tnsindia.streampidemo;

import java.util.Arrays;
import java.util.List;

public class MappingDemo {

	public static void main(String[] args) {
		List<String>obj1=Arrays.asList(new String[]{"Shweta","Diya","Rupali"});
		obj1.stream().map(i->i.length()).forEach((i)->System.out.print(i+ " "));

	}


	}
