// Basic examples of for loop 

public class ForLoopBasics{
    public static void main(String args[]){

        // ex-1: Print numbers 1 to 5
        for(int i = 1; i<=5; i++){
            System.out.println(i);
        }

        //ex-2: Print even numbers from 2 to 10
        for(int i = 2; i<=10; i+=2){
            System.out.println(i);
        }

        //ex-3: Print numbers in reverse (10 to 1)
        for(int i = 10; i>=1; i--){
            System.out.println(i);
        }

        
        // ex-4: Infinite loop example 
        // for (;;) {
        //     System.out.println("Runs forever!");
        // }
    }
}


/*for (initialization; condition; update) {
    // loop body
}*/


//Initialization → runs once.

//Condition → checked every iteration.

//Update → runs after each loop.