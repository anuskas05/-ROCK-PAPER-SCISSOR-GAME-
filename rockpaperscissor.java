//rock paper scissor game
import java.util.Random;
import java.util.Scanner;
public class rockpaperscissor{
 public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int playerinput=sc.nextInt();
        // int rock=0;
        // int paper=1;
        // int scissor=2;
        Random rnd= new Random();
        int computerinput=rnd.nextInt(3);

        if(computerinput==playerinput){
              System.out.println("MATCH IS DRAW");
        }
       else if(computerinput==0&&playerinput==1 || computerinput==1&&playerinput==2 || computerinput==0&&playerinput==2){
              System.out.println("you are win!");
        } 
       else if(computerinput==1&&playerinput==0 || computerinput==2&&playerinput==1 || computerinput==2&&playerinput==0){
              System.out.println("you are lost!");
        }
        
           System.out.println("computerchoice s"+computerinput);  
           if(computerinput==0){
              System.out.println("computer choice is rock");
           }
              else if(computerinput==1){
                     System.out.println("computer choice is paper");
              }
              else if(computerinput==2){
                     System.out.println("computer choice is scissor");
              }
           }    
        


}     

