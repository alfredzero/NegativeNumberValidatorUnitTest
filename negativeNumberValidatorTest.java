import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;



public class negativeNumberValidatorTest {

  negativeNumberValidator SUT;

  @Before
  public void setup() {
    SUT = new negativeNumberValidator();
  }
  @Test
  public void test1() {
    boolean result = SUT.isNegative(1);
    Assert.asserThat(result, is(false));
  }

  @Test
  public void test2() {
    boolean result = SUT.isNegative(0);
    Assert.assertThat(result, is(false));
  }

  @Test
  public void test3() {
    boolean result = SUT.isNegative(-1);
    Assert.assertThat(result, is(true));
  }
}
