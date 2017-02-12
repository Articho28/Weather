
//My first application of Object-Oriented Programming. The object explored will be the weather. 
public class WeatherEntry{ 
  //This class defines our new type: WeatherEntry.
  //Here are our 2 private variables. 
  private double temperatureInCelsius;
  private boolean isSunny;
  //Here is our constructor: it allows us to have access to the private variables. 
  public WeatherEntry(double initTemperature, boolean initIsSunny){
    temperatureInCelsius = initTemperature;
    isSunny = initIsSunny;
  }
  //A few get methods to access each attribute. 
  //This method allows us to access the attribute "temperatureInCelsius". 
  public double getTemperatureCelsius(){
    return this.temperatureInCelsius;
  }

  //This method determines whether or not it is a good day according to the values of our attributes. 
  public boolean isGoodWeather(){
    return this.temperatureInCelsius>(-30) && this.isSunny;
  }

 //This method displays the weather conditions in either Celsius or Farenheit. 
  public void display(boolean isCelsius){
    System.out.print("It is ");
    //If the user wants the values in degrees Celsius:
    if (isCelsius){
      System.out.print(this.getTemperatureCelsius() + " degrees Celsius ");
    }
    //If the user wants the degrees to be displayed in Farenheit: (Source: http://www.mathsisfun.com/temperature-conversion.html)
    else {
      System.out.print((this.getTemperatureCelsius() * 9.0/5) + 32);
      System.out.print(" degrees Farenheit");
    }
    //If the sun is shining (true), the sentence will inidcate so. 
    if (this.isSunny) {
      System.out.print("and is sunny. ");
    }
    //If the sun is not shining (false), the sentence will indicate so. 
    else {
      System.out.print(" and is not sunny. ");
    }
    //If the criteria for a good day are acheived, the sentence will indicate so. 
    if (isGoodWeather()) {
      System.out.print("It is a good day. ");
    }
    //If the criteria for a good day are not acheived, the sentence will indicate so. 
    else {
      System.out.print("It is not a good day.");
    }
  }
  
}


  
  
    
  
  
  
 
  
  
    
  


