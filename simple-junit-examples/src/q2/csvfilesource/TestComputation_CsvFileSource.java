package q2.csvfilesource;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TestComputation_CsvFileSource {

   // TODO: Write your answer to complete this test case
   @ParameterizedTest
   @CsvFileSource(resources = "computation_dataset.csv")
   public void testGetDiscount(int i1, int i2, int exp) throws Exception {

	  Computation com = new Computation();
      int result = com.getDiscount(i1, i2); 
      Assert.assertEquals(result, exp);

   }
}
