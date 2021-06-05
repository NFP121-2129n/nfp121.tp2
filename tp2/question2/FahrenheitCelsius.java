package question2;


/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * Cette classe est responsable de convertir des temperatures fahrenheit en celsius
 * @author Georges Ghafary 
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entrée de cette application, 
      * dont le commentaire est à compléter
      *
      *  @param args ...
      */
     public static void main(String[] args){
        for(int i = 0; i < args.length; i++){
            try{
                int fahrenheit = Integer.parseInt(args[i]);
                float celsius = fahrenheitEnCelsius(fahrenheit);
                if(celsius < -273.1) celsius = -273.1f;     
                System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C");
            }catch(NumberFormatException nfe){
               System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
            }  
        }  
     }
     
     /** 
      * la méthode à compléter. 
      *   @param f la valeur en degré Fahrenheit
      *   @return  la conversion en degré Celsius
      */
     public static float fahrenheitEnCelsius(int f){
        float c = (float)(5.0/9.0 * (f - 32));
        return (float)(((int)(c * 10))/10.0);
     }

}
