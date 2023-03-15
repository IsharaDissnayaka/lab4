public class Main {
   public static void main(String[] args) {
    Tree new1 = new Tree();
    new1.Insert(200, "ishara");
    new1.Insert(400, "isharatharindu");
    new1.Insert(500, "isharatharfdindu");
    new1.Insert(200, "isharatharindu");
    new1.Insert(131, "isharatharfdindu");

    new1.TraverseinOrder();
   }   
}
