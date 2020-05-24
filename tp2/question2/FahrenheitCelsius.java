package question2;


/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un num�ro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entr�e de cette application, 
      * dont le commentaire est � compl�ter
      *
      *  @param args ...
      */
     public static void main(String[] args){
       try{
       float celsius = 0;
        int[] tabFahrenheit = new int[args.length];
        
        for(int i=0; i<args.length; i++){
          tabFahrenheit[i] = Integer.parseInt(args[i]);
        }
        for(int i=0; i<args.length;i++){
          celsius=fahrenheitEnCelsius(tabFahrenheit[i]);
          if(celsius==0){
          throw new NumberFormatException("Invalid number !!");
          }
          System.out.println(tabFahrenheit[i] + "\u00B0F -> " + celsius + "\u00B0C");
        }               
      
       }catch(NumberFormatException nfe){
           System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
       }
       
     }
     
     /** 
      * la m�thode � compl�ter. 
      *   @param f la valeur en degr� Fahrenheit
      *   @return  la conversion en degr� Celsius
      */
     public static float fahrenheitEnCelsius(int f){
         try{    
         return (f-32)*5/9; // � compl�ter  en rempla�ant la valeur retourn�e par la fonction de conversion
        }catch(NumberFormatException nfe){
           return 0;
       }
    }

}
