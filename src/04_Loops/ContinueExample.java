public class ContinueExample{
    public static void main(String args[]){
        // example: print numbers 1 to 10, but skip 5
        for(int i = 1; i<=10; i++){
            if(i==5){
                System.out.println("Skipping number "+i);
                continue; // skip the rest of this iteration
            }
            System.out.println(i);
        }
        System.out.println("Loop finished with continue example");
    }
}


// continue; → skips current iteration and jumps to the next loop cycle.

// Unlike break (which stops loop entirely), continue just skips one step.