package org.generation.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class javaCalculatorTest {
      javaCalculator jvc;
      
      @Test
      @DisplayName("test per formulare l'addizione")
      void add() {
    	  jvc = new javaCalculator();
    	  float res = jvc.add(4, 2);
    	  assertEquals(6, res);
      }
      
      @Test
      @DisplayName("test per formulare la sottrazione")
      void subtract() {
    	  jvc = new javaCalculator();
    	  float res = jvc.subtract(4, 2);
    	  assertEquals(2, res);
      }
      
      @Test
      @DisplayName("test per formulare la divisione")
      void divide() throws Exception {
    	  jvc = new javaCalculator();
    	  float res = jvc.divide(4, 2);
    	  assertEquals(2, res);
      }
      
      @Test
      @DisplayName("test per formulare la divisione errata")
      void illegalDivide() throws Exception {
    	  jvc = new javaCalculator();
    	  assertThrows(Exception.class, ()->jvc.divide(2, 0));
      }
      
      @Test
      @DisplayName("test per formulare la divisione")
      void multiply() {
    	  jvc = new javaCalculator();
    	  float res = jvc.multiply(4, 2);
    	  assertEquals(8, res);
      }
}
