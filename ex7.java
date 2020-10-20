
/**
 * Write a description of class ex6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ex7
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        boolean con=true;
        int diceNum=0;
        int num=0;
        int tot=0;
        int sides=0;
        while(con){
            System.out.println("How many D6's do you want to roll?");
            diceNum=sc.nextInt();
            System.out.println("How many sides do these dice have?");
            sides=sc.nextInt();
            System.out.print("You rolled: ");
            for (int i = 0; i < diceNum; i++) {
                num=rollDie(sides);
                tot+=num;
                System.out.print(num + " ");
            }
            System.out.println(" ");
            System.out.println("Total: "+ tot);
            System.out.println(" ");
            System.out.println("Again? [y/n]");
            String ans=sc.next();
            if(ans.equals("y")){
                con=true;
            }else{
                con=false;
}
}
}
public static int rollDie(int sides){
    return ((int) (Math.random()*sides)+1);
    
}
}

