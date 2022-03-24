package gusessingGame;
import javax.swing.*;
public class gusessingGame{
    private static int i;
    public static void main(String[] args){
     int random_num=(int)(Math.random()*100+1);
     int answer=0;
     System.out.println("The correct Guess_number would be :"+random_num);
     int count=1;
     while(answer!= random_num && i<=9){
         String response=JOptionPane.showInputDialog(null, "Enter a random number 1 to 100 any \n you have only 9 truns","guesssing game",3);
         answer=Integer.parseInt(response);
         JOptionPane.showMessageDialog(null ," "+determineGuess(answer, random_num, count));
         i = count++;}
     }
    public static String determineGuess(int answer, int random_num , int count){
    
        if(answer <=0 || answer>100)
         return "your guess is invaild";
        else if(answer == random_num)
         return "correct! \n Total guesses:"+count;
        else if(answer>random_num)
         return"your guess is too high \n Try next number \n Total Gusess:" +count;
        else if(answer<random_num)
         return "your guess is too low  \n Try next number  \n Total Gusess:"+count;
        else
         return "your guess is incorrect \n Try number:"+count;  
        
       
    }




}