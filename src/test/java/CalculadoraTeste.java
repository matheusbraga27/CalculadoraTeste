
import src.*;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;


public class CalculadoraTeste  extends TestCase {
	
  public CalculadoraTeste (String testName) {
    super(testName);
  }
  
   @Test
   public void testSomar() {
	   Calculadora calc = new Calculadora();
	   assertEquals(40, calc.somar(10,30), 0);
   }
   
   @Test
    public void testSubtrair() {
      //TODO add your test code.
    }
}