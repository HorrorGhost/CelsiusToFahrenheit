import java.io.*;

public class FirstProject
{

public static void main(String args[]) throws IOException
{
 
    
 InputStreamReader read = new InputStreamReader(System.in);
 BufferedReader in = new BufferedReader(read);
 
 double celcius,fahrenheit;
 System.out.println("Enter the tempreture in celsius");
 celcius = Double.parseDouble(in.readLine());
 
 fahrenheit = (celcius*9/5)+32;
 
 if(fahrenheit>98.6)
  {
    System.out.println("Fever");
  }
 else
   System.out.println("Normal");
 
}
}
