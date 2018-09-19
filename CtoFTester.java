public class CtoFTester{
  public static void tester(){

    System.out.println(celsiusToFahrenheit(0));
    System.out.println(celsiusToFahrenheit(15));
    System.out.println(celsiusToFahrenheit(-50));
    System.out.println(celsiusToFahrenheit(-40));
    System.out.println(fahrenheitToCelsius(0));
    System.out.println(fahrenheitToCelsius(15));
    System.out.println(fahrenheitToCelsius(-50));
    System.out.println(fahrenheitToCelsius(-40));
  }

  public static double celsiusToFahrenheit(int a){
    return 1.8 * a + 32;
  }

  public static double fahrenheitToCelsius(int a){
    return (5 / 9) * (a - 32);
  }
}
