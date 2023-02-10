package com.lambda.expression.demo;

//creating interface method
interface StringDe{
	String reverse(String x);
	
}

public class LambdaExample {

	public static void main(String[] args) {
		
		StringExample result = (s1) -> {
			String c1 = "";
			for(int i=s1.length()-1; i>=0; i--)
				c1=c1+s1.charAt(i);
			return c1;
		};
		System.out.println(result.reverse("Hello"));
	}

}
