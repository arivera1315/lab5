import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner hexDexNum = new Scanner (System.in);
        System.out.println("Enter a hexadecimal number: ");
        String input = hexDexNum.next();
        input = input.replace("0x", "");
        Integer number = 0;
        Integer exponent = input.length() - 1;
        Double total = 0.0;
        while(number < input.length()) {
            String character = input.substring(number, number + 1);
            number++;
            Integer multiple = 0;
            if ((character.equals("A")) || (character.equals("a"))) {
                multiple = 10;
            } else if ((character.equals("B")) || (character.equals("b"))) {
                multiple = 11;
            } else if ((character.equals("C")) || (character.equals("c"))) {
                multiple = 12;
            } else if ((character.equals("D")) || (character.equals("d"))) {
                multiple = 13;
            } else if ((character.equals("E")) || (character.equals("e"))) {
                multiple = 14;
            } else if ((character.equals("F")) || (character.equals("f"))) {
                multiple = 15;
            } else if(character.equals("0")){
                multiple = 0;
            } else if(character.equals("1")){
                multiple = 1;
            }else if(character.equals("2")){
                multiple = 2;
            }else if(character.equals("3")){
                multiple = 3;
            }else if(character.equals("4")){
                multiple = 4;
            }else if(character.equals("5")){
                multiple = 5;
            }else if(character.equals("6")){
                multiple = 6;
            }else if(character.equals("7")){
                multiple = 7;
            }else if(character.equals("8")){
                multiple = 8;
            }else if(character.equals("9")){
                multiple = 9;
            }
            total = total + (multiple * ( Math.pow(16, exponent)));
            exponent = exponent - 1;
        }
        System.out.printf("Your number is %.0f in decimal", total) ;
	//GO GATA
    }

}
