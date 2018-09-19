public class CtoFTester{
  public static void main(String[] args){

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

  public static double fahrenheitToCelsius(int b){
    return (b - 32) * (5.0 / 9.0);
  }
}
