public class BreakExample{
    public static void main(String args[]){
        // example: stop the loop when number reaches 5
        for(int i = 1; i<=10; i++){
            if(i==5){
                System.out.println("Breaking the loop at i = "+i);
                break; //exit the loop immediately
            }
            System.out.println(i);
        }
        System.out.println("Loop ended after break.");
    }
}

/*
break; → immediately jumps out of the loop.

Code after break in the loop body is not executed.

Common use: stop searching once you find what you want.
*/