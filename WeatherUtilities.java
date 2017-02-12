//Assignment 3 Question 3.

//Import the Scanner to allow the user to provide input as the prorgram is running. 
import java.util.Scanner;

//This class will be using our new type. 
public class WeatherUtilities{
  //Question 3.1
  //This method will use loops to examine the elements of the two arrays and determine the number of good days. 
  public static int countGoodDays(double[] temperatures, boolean[] sunny){
    //If the arrays are of different lenghts, we must throw an excepetion to tell the user to fix the problem.
    if (temperatures.length != sunny.length){
      throw new IllegalArgumentException("The lengths of the Arrays do not match.");
    }
    //Start the counter of good days. 
    int dayCount = 0;
    for (int i = 0; i < temperatures.length; i++) {
      //If the conditions are fulfilled, increment the counter. 
      if (temperatures[i]>-30 && sunny[i]==true){
        dayCount++;
      }
    }
    return dayCount;
  }
  //Question 3.2
  //This method will use the new defined type to execute the same task as the previous method. 
  //The input is of type WeatherEntry and is called weatherObjects.
  public static int countGoodDays(WeatherEntry[] weatherObjects) {
    //Start the counter of good days. 
    int dayCount = 0;
    for (int i = 0; i < weatherObjects.length; i++) {
      //If the input matches the conditions for it to be a good day, increment the counter. 
      if (weatherObjects[i].isGoodWeather()){
        dayCount++;
      }
    }
    return dayCount;
  }
  
  //Question 3.3: Our main method will take input from the user and record the data to create an array of
  //WeatherEntry. It will then determine how many good days there were and record the highest and lowest temperatures 
  //with the private helper methods defined below. 
  //This method is a helper method used to identify the highest recorded temperature. 
  private static double findMax(WeatherEntry[] weatherHotDays) {
    double maxTemp = weatherHotDays[0].getTemperatureCelsius(); 
    double temp;
    for (int i = 0; i < weatherHotDays.length; i++){
      temp = weatherHotDays[i].getTemperatureCelsius();
      if (temp > maxTemp) {
        maxTemp = temp;
      }
    }
    return maxTemp;
  }
  //This method is a helper method used to identify the lowest recorded temperature. 
  private static double findMin(WeatherEntry[] weatherColdDays) {
    double minTemp = weatherColdDays[0].getTemperatureCelsius(); 
    double temp;
    for (int i = 0; i < weatherColdDays.length; i++){
      temp = weatherColdDays[i].getTemperatureCelsius();
      if (temp < minTemp) {
        minTemp = temp;
      }
    }
    return minTemp;
  }
 //Our main method begins here. 
  public static void main(String[] args){
    //The argument input must be in integers. 
    int numObjects = Integer.parseInt(args[0]);
    //The array of type WeatherEntry will be as long as the argument indicates it will be. 
    WeatherEntry[] WeatherArray = new WeatherEntry[numObjects];
    //The scanner will expect input from the keyboard. 
    Scanner reader = new Scanner(System.in);
    for (int i = 0; i < numObjects; i++) {
      //The user inputs the temperature in Celsius: the Scanner expects a double value.
       System.out.println("Please enter the temperature in degrees Celsius: ");
      //The input is then stored in the variable 'temperature'. 
       double temperature = reader.nextDouble();
       System.out.println("Please enter whether or not it was sunny: ");
      //The boolean input is stored into the variable 'sunnyDay'. 
       boolean sunnyDay = reader.nextBoolean();
      //The two recorded inputs will then be stored to create an object and store it into the array.
       WeatherArray[i] = new WeatherEntry(temperature, sunnyDay);
      //The object is stored: the loop restarts to store the following object. 
    }
    //We close the Scanner once we are done using it. 
    reader.close();
    //The number of good days, determined from the data provided by the user, is displayed.
    //The highest and lowest temperatures are shown using the private helper methods. 
    System.out.println("There were " + countGoodDays(WeatherArray) + " nice days.");
    System.out.println("The highest temperature was " + findMax(WeatherArray) + " degrees Celsius and the lowest was " + findMin(WeatherArray) + ".");
  }
}
  
  

