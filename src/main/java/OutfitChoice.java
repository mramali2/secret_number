import java.util.Scanner;

public class OutfitChoice {
    public static void main(String[] args){
//        Prompt user to input the weather and temperature
        Scanner reader = new Scanner(System.in);

        System.out.println("What is the weather like? ");
        String weather = reader.nextLine();

        System.out.println("What is the temperature? ");
        int temperature = reader.nextInt();
//Create set of conditions with combinations of weather and temperature to output outfit
        if(weather.equals("rainy")  && temperature < 12 ){
            System.out.println("Wear a waterproof winter coat");
        }else if(weather.equals("rainy") && temperature >=12 ){
            System.out.println("Wear a light waterproof jacket");
        } else if (weather.equals("sunny") || temperature > 20) {
            System.out.println("Wear sunglasses");
        } else{
            System.out.println("Wear whatever you want!"); //Output if none of the conditions are met
        }
    }
}
