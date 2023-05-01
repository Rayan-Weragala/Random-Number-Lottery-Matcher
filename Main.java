
//lottrey class
import java.util.Random;
import java.util.Scanner;

class Lottrey {

  private int[] lottreyNum;
  private int x;

  public Lottrey() {
    lottreyNum = new int[5];
    
    for (int i = 0; i < 5; i++) {
      Random R1 = new Random();
      int rand_number = R1.nextInt(10);

      lottreyNum[i] = rand_number;
    }
  }

  public void printLottery() {
    System.out.println("\n" + "Lottrey values are");

    for (int i = 0; i < 5; i++) {
      System.out.print(lottreyNum[i] + " ");//printing random numbers
    }
  }

  public int compareLottrey(int array) {

    for (int i = 0; i < lottreyNum.length; i++) {

      if (array == lottreyNum[i]) {

        x++;
      }
    }
    return x;

  }
}

// main

public class Main {
  private static int value;

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int[] array = new int[5];
    for (int i = 0; i < array.length; i++) {
      System.out.println("Enter the number " + (i + 1) + " :");
      array[i] = scan.nextInt();
    }

    Lottrey l1 = new Lottrey();
    // printing user input values
    System.out.println("\n" + "User Values are: " + "\n");
    for (int i = 0; i < array.length; i++) {

      System.out.print(array[i] + " ");//printing user inputs

    }

    // calling compareLottrey method
    for (int i = 0; i < array.length; i++) {
      value = l1.compareLottrey(array[i]);
    }
    System.out.println("\n" + "Number of matching entries are: " + value);

    l1.printLottery(); // calling printLottery method
  }

}
