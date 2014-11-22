
//Stack Implementation by array

public class StackArray {
	
	private int maxSize;
	   private String[] stackArray;
	   private int top;
	   public StackArray(int s) {
	      maxSize = s;
	      stackArray = new String[maxSize];
	      top = -1;
	   }
	   public void push(String j) {
	      stackArray[++top] = j;
	   }
	   public String pop() {
	      return stackArray[top--];
	   }
	   public String peek() {
	      return stackArray[top];
	   }
	   public boolean isEmpty() {
	      return (top == -1);
	   }
	   public boolean isFull() {
	      return (top == maxSize - 1);
	   }


//	public static void main(String[] args) {
//		
//		StackArray theStack = new StackArray(10); 
//	      theStack.push("10");
//	      theStack.push("20");
//	      theStack.push("30");
//	      theStack.push("40");
//	      theStack.push("50");
//	      while (!theStack.isEmpty()) {
//	         String value = theStack.pop();
//	         System.out.print(value);
//	         System.out.print(" ");
//	      }
//	      System.out.println("");
//	   }

	
}
