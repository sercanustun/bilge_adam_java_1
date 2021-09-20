package com.bilgeadam.main;

public class Boxing {
	
	public static void main(String[] args) {
		int numArguments = args.length;
		System.out.println(numArguments);
		int sum = 0;
		int x;
		for (int i = 0; i < numArguments; i++) {
			System.out.println(args[i]);
			x = Integer.parseInt(args[i]);
			sum += Integer.parseInt(args[i]);
			
		}
		System.out.println(sum);
		Double d = new Double(5.5);
		Double dd = 5.5;
		System.out.println(dd.intValue());
	}
	
}
