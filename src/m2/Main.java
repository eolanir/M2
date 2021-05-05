package m2;
import java.util.LinkedHashMap;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Formatter;

public class Main {

    
	public static void main(String[]args) throws InterruptedException{
        //NIVELL 1
        //Fase 1
        System.out.println("NIVELL 1");
        System.out.println("\nFase 1");

        char[] nom = {'J','u','l','i','o',' ','A','l','t','i','s','e','n','t'};

        for(char i : nom){
            System.out.println(i);
        }

        //Fase 2
        System.out.println("\nFase 2");

        ArrayList<Character> nomList = new ArrayList<Character>();
        for(char i : nom){
            nomList.add(i);
        }

        for(char i : nomList){
            System.out.print(i);
            if (Character.isLetter(i)){
                if(i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u' || i == 'A' || i == 'E' || i == 'I' || i == 'O' || i == 'U'){
                    System.out.println(" VOCAL");
                } else {
                    System.out.println(" CONSONANT");
                }
            } else if(Character.isDigit(i)){
                System.out.println(" Els noms de persones no contenen números!");
            } else {
                System.out.println("");
            }
        }

        //Fase 3
        System.out.println("\nFase 3");

        LinkedHashMap<Character, Integer> name = new LinkedHashMap<Character, Integer>();

        name.put('J', 1);
        name.put('u', 1);
        name.put('l', 1);
        name.put('i', 1);
        name.put('o', 1);

        for(Character i : name.keySet()) {
        	System.out.println("Clau: " + i + " Valor: " + name.get(i));
        }
        
        //Fase 4
        System.out.println("\nFase 4");
        ArrayList<Character> surname = new ArrayList<Character>();

        surname.add('A');
        surname.add('l');
        surname.add('t');
        surname.add('i');
        surname.add('s');
        surname.add('e');
        surname.add('n');
        surname.add('t');
        
        

        ArrayList<Character> fullName = new ArrayList<Character>();

        fullName.addAll(name.keySet());
        fullName.add(' ');
        fullName.addAll(surname);
        
        for(Character i : fullName) {
        	System.out.println(i);
        }
        
        //NIVELL 2
        System.out.println("\nNIVELL 2");

        int vertical = 10;
        int[] linies = new int[vertical];

        linies[0] =  1;

        for(int i = 1; i < linies.length; i++){
            linies[i] = linies[i-1] + 1;
        }

        for(int i = 1; i <= vertical; i++){
            for(int z = 0; z < i; z++){
                if(z == i-1){
                    System.out.println(linies[z]);
                } else {
                    System.out.print(linies[z]);
                }
            }
        }


        //Piramide invertida
        System.out.println("\nPiramide invertida");

        int altura = 6;
        String[] stars = new String[altura];
        stars[stars.length - 1] = "*";

        for(int i = stars.length-2; i >= 0; i--){
            stars[i] = stars[i+1] + "**";
        }

        for(int i = 0; i < stars.length; i++){
            for(int z = 0; z < i; z++){
                System.out.print(" ");
            }
            System.out.println(stars[i]);
        }


        //NIVELL 3
        System.out.println("\nNIVELL 3");
        
        int hour = 0;
        int minutes = 0;
        int seconds = 0;

        
        int i = 0;
        while(i==0){
            String fHour = String.format("%02d", hour);
            String fMinutes = String.format("%02d", minutes);
            String fSeconds = String.format("%02d", seconds);
            
            System.out.println(fHour + ":" + fMinutes + ":" + fSeconds);
        	
            seconds++;
            if(seconds == 60) {
            	seconds = 0;
            	minutes++;
            	if(minutes == 60) {
            		minutes = 0;
            		hour++;
            		if(hour == 24) {
            			hour = 0;            			
            		}
            	}
            }         

            Thread.sleep(1000);
        }

    }
	
}


