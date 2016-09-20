/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissor;

/**
 *
 * @author uyen
 */
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x; // User's choice
        int y; // Computer choice
        
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
               
        System.out.printf("Enter your choice 0=Rock, 1=Paper or 2=Scissors?");
        x = scanner.nextInt();
        if(x<0 || x>2)
        {
            System.out.println("Invalid choice!");
            System.exit(0);
        }
        y = random.nextInt(3);
             
        if(x==y)
        {
            if(x==0)
            {
                System.out.println("Both players choose Rock. You are equal!");
            }
            else if(x==1)
            {
                System.out.println("Both players choose Paper. You are equal!");
            }
            else
            {
                System.out.println("Both players choose Scissors. You are equal!");
            }
            System.exit(0);
        }
        if(x==0)
        {
            if(y==1)
            {
                System.out.println("You chose Rock. Computer choses Paper");
                System.out.println("Computer wins!");
            }
            else
            {
                System.out.println("You chose Rock. Computer choses Scissors");
                System.out.println("You win!");
            }
        }
        else if(x==1)
        {   
            if(y==0)
            {
                System.out.println("You chose Paper. Computer choses Rock");
                System.out.println("You win!");
            }
            else
            {
                System.out.println("You chose Paper. Computer choses Scissors");
                System.out.println("Computer wins!");
            }
        }
        else
        {
            if(y==0)
            {
                System.out.println("You chose Scissors. Computer choses Rock");
                System.out.println("Computer wins!");
            }
            else
            {
                System.out.println("You chose Scissors. Computer chose Paper");
                System.out.println("YOu win!");
            }
        }
   
    }
    
}
