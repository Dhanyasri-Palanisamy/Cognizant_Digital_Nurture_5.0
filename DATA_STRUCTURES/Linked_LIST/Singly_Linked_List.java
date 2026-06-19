

class Singly_Linked_List{
  Node head;
 
 void add(int data){
    
   Node node = new Node( data);
     if(head==null){
         
        head= node;
     }
    else{
        Node curr= head;
        while(curr.next!=null){
          curr= curr.next;
           }
       curr.next= node;
   }
}

   void insertAtPos(int data, int pos){
      
       Node node= new Node(data);
       
       
         if(pos==0){

            node.next=head;
            head= node;
             }
         else{
           Node curr= head;
            int i=1;
            while(i<pos-1){
              
              if(curr.next== null)
               {
 		       System.out.println("Pos is out of bound");
			    return;
		       }
            curr= curr.next;
             i++;
            }


            if (curr == null) {
    System.out.println("Position is out of bound");
    return;
}
           
             Node nxt= curr.next;
             node.next= nxt;
             curr.next= node;
             }

}

void traverse(){
    Node curr= head;
    while(curr!=null){
      System.out.print(curr.data+"-->");
      curr= curr.next;
    }
    System.out.println("null");
}

               
}

