class tree{
    BinarySearchTree bt= new BinarySearchTree();
    bt.insertnode(10);
    bt.insertnode(20);
    bt.insertnode(8);

    bt.inorder();

}
class node{

        int data;
        node left;
        node right;
        public node(data){
            this.data= data;
        }
    
}
class BinarySearchTree{
    node root;
    public void insertnode(int data){
        root= insertn(root, data);
    }
    public node insertn(node root, int data){
        if(root==null){
            root= new node(data);
        }
        else if(data>root.data){
            root.right = insertn(root.right, data);
        }
        else if(data<root.data){
            root.left= insertn(root.left,data);
        }

        return root;
        
    }
    public void inorder(){
        intheorder(root);
    }

    public void intheorder(node root){
        
    }

}