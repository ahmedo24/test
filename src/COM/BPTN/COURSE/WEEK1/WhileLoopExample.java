package COM.BPTN.COURSE.WEEK1;

//declare a class named WhileLoopExample
public class WhileLoopExample {
	
    public static void main(String[] args) {
    	
    	 //declare an integer variable and name it number and initialize it with the value 1.
    	 int number = 1;
    	 
    	
    	 //loop condition is number <= 5, 
    	// which means the loop will continue as long as the value of number is less than or equal to 5.
    	 while (number <= 5) {
    		 
    	//System.out.println(number); statement prints the current value of the number variable.
          System.out.println(number);
            
        //number++; is used to increment the value of number by 1, used as a counter in order to break the boolean condition to
        // avoid an infinite loop
          number++;
          
         // The loop iterates, and the process repeats until the condition number <= 5 becomes false.

          //Summarize
          //Once number becomes 6 (because we increment it after printing 5), 
          //the condition number <= 5 becomes false, and the loop exits.
        }
    }
}