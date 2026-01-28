import java.util.Scanner;

public class Ruin {
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.print("Enter your starting amount of $: "); 
double startAmount = scan.nextDouble();
System.out.print("The win chance is: ");
double winChance = scan.nextDouble();
double winLimit = startAmount * 2;
int count = 0;
double current_amount = startAmount;


for(int totalSimulations = 1; totalSimulations <= 100; totalSimulations++){

System.out.println("The day is " + totalSimulations);
while(current_amount <= winLimit && current_amount > 10){
double turn = Math.random();
    if(turn <= winChance){
        current_amount = current_amount + 25;
        count = count + 1;
      
    }
    else{
        count = count + 1;
        current_amount = current_amount - 10;
       
    }

}

System.out.println("The current amount is " + current_amount);
System.out.println("The number of turns it took was " + count);
if(current_amount >= winLimit){
    System.out.println("Current amount: " + current_amount + " = WIN");

}
else{
    System.out.println("Current amount: " + current_amount + " = LOSS");
}
current_amount = startAmount;
count = 0;


}


}
}

