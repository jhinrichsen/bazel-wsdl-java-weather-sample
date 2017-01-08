
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import net.webservicex.*;

public class WeatherTest {
  @Test
  public void test1() {
      System.out.println("Requesting cities by country...");
      GlobalWeatherSoap gws = new net.webservicex.GlobalWeather().getGlobalWeatherSoap();
      String s = gws.getCitiesByCountry("Germany");
      System.out.println("Result: " + s);
      assertEquals(true, true);
  }
}
