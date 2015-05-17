package continuousintegration;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.BeforeClass;
import org.junit.Test;

import continuousintegration.service.HelloWorldService;

public class UtilTest {
	  private static HelloWorldService helloWorldService;


  @BeforeClass
  public static void setUp(){
    //Create mock object of BookDAL
	  helloWorldService = mock(HelloWorldService.class);
    when(helloWorldService.equalityCheck(2,2)).thenReturn(true);
  }
  @Test
  public void testService() throws Exception {
	  boolean boolval = helloWorldService.equalityCheck(2, 0);
	  assertTrue(boolval);
  }

}