class Node{
    public String name;
    public int emp_num;

    public Node Left;
    public Node Right;

    public Node(int id, String name){
        this.name=name;
        this.emp_num=id;
    }

    public void DisplayNode(){
        System.out.println("Employee Number :-"+emp_num+" Employee name :-"+name);
    }
}