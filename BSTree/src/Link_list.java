
public class Link_list {
	private Node root;
	
	public Link_list(){
		root=null;
	}
	
	public Node add(Node thenode, int thedata){
		if (thenode==null){
			thenode = new Node(thedata);
		}
        else if(thedata<=thenode.data){
        	thenode.left=add(thenode.left, thedata);
        }
        else{
            thenode.right = add(thenode.right, thedata);
        }
        return thenode;
    }
	
	public void infix(Node n){
		if (n!=null){
	         infix(n.left);
	         System.out.print(n.data +", ");
	         infix(n.right);
		}
	}
	
}
	
	class Node{
		int data;
		Node left;
		Node right;
		
	public Node(int thedata){
		data=thedata;
		left=null;
		right=null;
	}
	}



