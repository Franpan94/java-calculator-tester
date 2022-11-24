package org.generation.calculator;

public class javaCalculator {
	
     public float add(float num1, float num2) {
    	 return num1 + num2;
     }
     
     public float subtract(float num1, float num2) {
    	return num1 - num2;
     }
     
     public float divide(float num1, float num2) throws Exception {
    	 if(num1 == 0 || num2 == 0) {
    		 throw new Exception("Non è possibile eseguire la divisione, dato che uno dei 2 numeri è = a 0");
    	 } 
    	 return num1/num2;
     }
     
     public float multiply(float num1, float num2) {
    	 return num1 * num2;
     }
}
