public class DoWhileLoopBasics{
    public static void main(String args[]){
        // example: Print numbers 1 to 5
        int i = 1;
        do{
            System.out.println(i);
        }
        while(i<=5);
    }
}


/*
do {
    // code
} while (condition);
*/

// Code executes first, then condition is checked.
// do-while always executes at least once, no matter what the condition is.