package com.pichelman.lambdaExpressions;

public class Main {
/* New for Java 1.8 is lambda expressions.  Make sure you are running Java 1.8
 * to test this code or it will not compile.
 * 
 * http://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html
 */
    interface IntegerMath {
        int operation(int a, int b);   
    }
  
    public int operateBinary(int a, int b, IntegerMath op) {
        return op.operation(a, b);
    }
    
	public static void main(String[] args) {
		Main myApp = new Main();
        IntegerMath addition = (a, b) -> a + b;
        IntegerMath subtraction = (a, b) -> a - b;
        
        System.out.println("40 + 2 = " + myApp.operateBinary(40, 2, addition));
        System.out.println("20 - 10 = " + myApp.operateBinary(20, 10, subtraction));   
		
	}
}
