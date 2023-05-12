import java.util.* ;
import java.io.*; 
class Squaree {
	
	// Write your code here

	public int length;
	public Squaree(){
		length =10;


	}
	public Squaree(int l){
		length = l;
	}

	 public void printArea(){
		System.out.println(length*length);
	}
}
	
class Square {
	
	public static void main(String args[]) {
		
		// Write your code here
		Squaree obj = new Squaree();
		obj.printArea();
		
	
	

		
	}
}
	
		