/*Purpose: The purpose of the program is to create 50 random numbers 
 * and then insert them into an array. Then from the array, the
 * numbers get inserted into a binary search tree that I created
 * through a linked list. Finally, the numbers are printed through the 
 * infix method, traversing the binary tree in numerical order.
 * 
 * Solution/Algorithms: After making the array with 50 random numbers,
 * I made the Link_list class which has the functionality to add and to
 * do an infix traversal. Both the add and infix methods are 
 * recursive.
 * 
 * Data structures used in solution: array to initially store the
 * numbers, and the Link-list class that I created, which includes
 * nodes from the node class that contain a root and a left and right 
 * child.
 * 
 * How to use, expected input/output: The only thing a user has to do is 
 * hit the run button. There is no user input, but an array is created 
 * and filled with random numbers to start. The output should both print
 * the original array, without the numbers sorted, and then print the 
 * result of the infix method, which sorts the numbers.
 * 
 * Purpose of each class: the BSTree is the main class that calls the
 * other classes. The Node class creates nodes to insert into the binary
 * tree, which is formed using the third class, Link_list.
 * 
 * 

*/
import java.util.Arrays;
public class BSTree {

	public static void main(String[] args) {
	
		int[] randonum = new int [50];
		for(int i=0; i<randonum.length;i++){
			randonum[i] = (int)(Math.random()*100);
		}
		System.out.println(Arrays.toString(randonum));
		
		Link_list theBStree= new Link_list();
		Node thenode = new Node(randonum[0]);
		
		for(int i=0; i<randonum.length; i++){
			//precondition: have a node and integer to input,
			theBStree.add(thenode,randonum[i]);
			//postcondition: depending on the value of the data, it will
			//get inserted through this method which recursively finds
			//where to insert it.
		}
		//precondition: take the root of a binary tree
		theBStree.infix(thenode);
		//postcondition: recursively goes through using an infix method
		//of traversal to print the values of the nodes from smallest to 
		//largest.
	}

}
