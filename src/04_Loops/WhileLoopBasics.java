public class WhileLoopBasics{
    public static void main(String args[]){
        // ex-1: Print numbers 1 to 10

        int i = 1;  // initialization
        while(i<=10){
            System.out.println(i);
            i++;    // update
        }

        // ex-2: Print numbers 10 down to 1
        int j = 10;
        while(j>=1){
            System.out.println(j);
            j--;
        }

        // Example 3: Infinite loop example (commented out) 
        // while (true) {
        //     System.out.println("This will run forever!");
        // }
    }
}


// Initialization → Condition → Update are crucial to avoid infinite loops.