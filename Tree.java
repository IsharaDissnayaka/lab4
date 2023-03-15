class Tree{
    Node Root;
public Tree (){
        Root = null;
    }
public Node Find(int num){
        Node curr =Root;
        while(curr.emp_num!=num){
            if(curr.emp_num < num){
                curr = curr.Right;
            }else{
                curr =curr.Left;
            }

            if(curr == null){
                return null;
            }
        }
        return curr;
    }
public void Insertmy(int emp, String name){  
        Node newly = new Node(emp,name);
        if(Root==null){
            Root= newly;
        }else{
            Node curr = Root;
            while(true){
                
                if(  emp<curr.emp_num){
                    if(curr.Left==null){
                        curr.Left = newly;
                        return ;
                    }
                    else{
                        curr=curr.Left;
                    }
                }else{
                    if(curr.Right==null){
                        curr.Right = newly;
                        return ;
                    }
                    else{
                        curr=curr.Right;
                    }
                }
            }
        }
    }
    public void Insert(int emp, String name){  
        Node newly = new Node(emp,name);
        if(Root==null){
            Root= newly;
            System.out.println(" First added" +Root.emp_num);
        }else{
            Node curr = Root;
            Node perent;
            while(true){
                 perent = curr;
                if(  emp<curr.emp_num){
                    System.out.println("if is working");
                    curr=curr.Left;
                    if(curr==null){
                        perent.Left =newly;
                        return ;
                    }
                }else{
                    System.out.println("else is working");
                    curr=curr.Right;
                    if(curr==null){
                        perent.Right =newly;
                        return ;
                    }
                }
            }
        }
    }
    
    private void inorder(Node localRoot){
        if(localRoot != null ) {
            inorder(localRoot.Left);
            localRoot.DisplayNode();
            inorder(localRoot.Right);
        }
    }


    public void TraverseinOrder(){
        inorder(Root);
    }


    private void postorder(Node localRoot){
        if(localRoot != null ) {
            localRoot.DisplayNode();
            inorder(localRoot.Left);
            inorder(localRoot.Right);
        }
    }


    public void Traversepostorder(){
        postorder(Root);
    }


    private void peroder(Node localRoot){
        if(localRoot != null ) {
            inorder(localRoot.Left);
            inorder(localRoot.Right);
            localRoot.DisplayNode();
        }
    }


    public void Traverseperoder(){
        peroder(Root);
    }

   private Node FindRescursive(Node localRoot, int empono){
    if(localRoot == null){
        return null;
    }else if(localRoot.emp_num == empono){
        System.out.println(localRoot.name);
        return localRoot;
    }
    else if(empono<localRoot.emp_num){
        return FindRescursive(localRoot.Left, empono);
    }else{
        return FindRescursive(localRoot.Right, empono);
    }
   }

   public Node callRecursive(int empno){
    return FindRescursive(Root, empno);
   }

   public void delerall(){
    Root = null;
   }


}