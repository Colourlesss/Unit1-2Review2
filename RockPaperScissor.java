import java.util.Scanner;

public class RockPaperScissor
{   
    static final int ROCK = 1;
    static final int PAPER = 2;
    static final int SCISSOR = 3;
    
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Wanna play with the smartest program in the world?");
        char command = 'y';
        do{
        System.out.print("What do you throw? [1] Rock, [2] Paper, [3]Scissors ");
        int input = sc.nextInt();
        int response = (int)(Math.random()*3) + 1;
        dialogue(input, response);
        win(input, response);
        System.out.print("Wanna Play Again? [y,n]");
        sc.nextLine();
        command = sc.nextLine().charAt(0);
        }while(command !='n');
    }
    public static void dialogue(int input, int response){
        System.out.print("You threw ");
        switch(input){
            case 1:
                System.out.print("rock! ");
            break;
            case 2:
                System.out.print("paper! ");
            break;
            case 3:
                System.out.print("scissors! ");
            break;
        }
        System.out.print("I threw ");
        switch(response){
            case 1:
                System.out.print("rock! ");
            break;
            case 2:
                System.out.print("paper! ");
            break;
            case 3:
                System.out.print("scissors! ");
            break;
        }
        System.out.println();
    }
    public static void win(int input, int response){
        if(input==response){
            System.out.println("A draw ... pretty good, human! I demand a rematch...");
        }else if(input%3>response%3){
            System.out.println("Whaaa??... You beat me? RAGE!");
        }else{
            System.out.println("I win! You are not a challenge for me...");
        }
    }
}
