import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
    Tree new1 = new Tree();
    new1.Insert(149, "Anushka");
    new1.Insert(150, "Kosala");
    new1.Insert(130, "dinusha");
    new1.Insert(155, "Malith");
    new1.Insert(131, "jayamini");

    new1.TraverseinOrder();
    new1.Traverseperoder();
    new1.Traversepostorder();

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Employee number :-");
    int newone = sc.nextInt();

      Node display =new1.callRecursive(newone);
      display.DisplayNode();


      new1.delerall();
   }   
}
