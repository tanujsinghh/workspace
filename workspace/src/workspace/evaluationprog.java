package workspace;

import java.util.TreeSet;

public class evaluationprog {

	public static void main(String[] args) {
		//Assigned Program: to remove an element from tree set
		
		TreeSet <Integer>tree_no = new TreeSet<Integer>();
		   // Adding numbers in the tree
		   tree_no.add(16);
		   tree_no.add(24);
		   tree_no.add(46);
		   tree_no.add(67);
		   tree_no.add(56);
		   tree_no.add(23);
		   tree_no.add(45);
		   tree_no.add(12);
		   tree_no.add(11);
		   System.out.println("input tree set: "+tree_no);//printing given inputs
		   System.out.println("Removes element 56 from the list: "+tree_no.remove(56));//it'll return true if the element i found and delete it
		   System.out.println("Removes element which is not present in list: "+tree_no.remove(99));//if element not found it'll return false
		   System.out.println("Tree set after removal of element: "+tree_no);//printing updated list

	}

}
