package com.mycompany.streamfilterpredicate;

import java.util.Arrays;
import java.util.List;

public class ColonOperator {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("apple", "Mango", "Banana", "grapes", "guava");
		
		//names.forEach(name->System.out.println(name));
		
		names.forEach(System.out::println);//double colon operator

	}

}
