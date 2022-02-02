
import java.util.Scanner;

public class horoscopes {

    /*
    Kullanıcıdan doğduğu ay ve gün bilgilerini girmesini isteyelim.

    Belirlenen koşullara göre hangi burç olduğunu bulalım.
     */

    public static void main(String[] args) {

        int month, day;
        String horoscope = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Month of your birth:");
        month = input.nextInt();

        System.out.print("Day of your birth:");
        day = input.nextInt();

        if (month == 1){
            if ( day >= 1 && day <= 31){
                if ( day > 19){
                    horoscope = " Aquarius";
                }else {
                    horoscope = "Capricorn";
                }
            }else{
                isError = true;
            }
        }
        if ( month == 2){
            if ( day >= 1 && day <= 29){
                if ( day > 18){
                    horoscope ="Pisces";
                }else{
                    horoscope = " Aquarius";
                }
            }else{
                isError= true;
            }
        }
        if ( month == 3){
            if ( day >= 1 && day <= 31){
                if ( day > 20){
                    horoscope = "Aries";
                }else{
                    horoscope = "Pisces";
                }
            }else{
                isError = true;
            }
        }
        if ( month == 4){
            if ( day >= 1 && day <= 30){
                if ( day > 19){
                    horoscope = "Taurus";
                }else{
                    horoscope = "Aries";
                }
            }else{
                isError = true;
            }
        }
        if ( month == 5){
            if ( day >= 1 && day <= 31){
                if ( day > 20){
                    horoscope = "Gemini";
                }else{
                    horoscope = "Taurus";
                }
            }else{
                isError = true;
            }
        }
        if ( month == 6){
            if ( day >= 1 && day <= 30){
                if ( day > 20){
                    horoscope = "Cancer";
                }else{
                    horoscope = "Gemini";
                }
            }else{
                isError = true;
            }
        }
        if ( month == 7){
            if ( day >= 1 && day <= 31){
                if ( day > 22){
                    horoscope = "Leo";
                }else{
                    horoscope = "Cancer";
                }
            }else{
                isError = true;
            }
        }
        if ( month == 8){
            if ( day >= 1 && day <= 31){
                if ( day > 22){
                    horoscope = "Virgo";
                }else{
                    horoscope = "Leo";
                }
            }else{
                isError = true;
            }
        }
        if ( month == 9){
            if ( day >= 1 && day <= 30){
                if ( day > 22){
                    horoscope = "Libra";
                }else{
                    horoscope = "Virgo";
                }
            }else{
                isError = true;
            }
        }
        if ( month == 10){
            if ( day >= 1 && day <= 31){
                if ( day > 23){
                    horoscope = "Scorpio";
                }else{
                    horoscope = "Libra";
                }
            }else{
                isError = true;
            }
        }
        if ( month == 11){
            if ( day >= 1 && day <= 30){
                if ( day > 21){
                    horoscope = "Sagittarius";
                }else{
                    horoscope = "Scorpio";
                }
            }else{
                isError = true;
            }
        }
        if ( month == 12){
            if ( day >= 1 && day <= 31){
                if ( day > 21){
                    horoscope = "Capricorn";
                }else{
                    horoscope = "Sagittarius";
                }
            }else{
                isError = true;
            }
        }
        if (isError){
            System.out.println("You made invalid entry. Please try again");
        } else {
            System.out.println("Your horoscope is:" + horoscope);
        }

    }
}
