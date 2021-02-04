package week1;

public class ArraysExamples {
    public static void main(String[] args) {
        exampleOne();
        double[] arr = {2.3, 1.4, 7.6, 0.4};
        exampleTwo(arr);
        System.out.println(arr);
        exampleThree();
        exampleFour();
        exampleFive();
    }

    private static int[] exampleFive() {
        int[] longarray = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        //Building array

        //Counting through array
        for(int i=0; i<longarray.length; i++) {
           
            if (longarray[i] == 4 && i > 0) { //Checking if an index has a value of 4, and its bigger than zero
                int[] replacement;
                replacement = new int[i];
                for (int j=0; j<replacement.length; j++) {
                    replacement[j] = longarray[j];
            }

            System.out.println("__________");
            for(int x:replacement){
                System.out.print(x + " ");

        }

        }
        

    }
    return longarray;
    }
    

    private static void exampleFour() {
        //int[] zeroarranger = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9}; 
        //Building new array

        //int regcount = 0; //All regular elements

        //for(int i = 0; i < n; i++){ 
        //    if (zeroarranger[i] != 0); //UNFINISHED
        //        zeroarranger[regcount++] = zeroarranger[i];
       // }

        //while (regcount < n) {
        //    zeroarranger[regcount++] = 0;
        //}
            
    }

    private static void exampleThree() {
        int[] field = new int[20];
        //Building new array

        for(int i=0; i<field.length; i++) { //Counting through index

            //Getting remainder of indexes to check if they are even
            if (i%2!=0) { 
                field[i] = 1; //If undeven, value is made one
            } 
            else {
                field[i] = i; //If even, value is made its respective index
            }
        }
        System.out.println("__________");
        for(int x:field){
            System.out.print(x + " ");
        }
        
    }

    private static void exampleTwo(double[] arr1) {
        
        double sum = 0;

        for (double x : arr1) {
            sum += x;
        }

    }

    private static void exampleOne() {
        int[] arr = new int[10];
        // Declaring an Array

        // For loop that counts
        for(int i=0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*10+1);
        }

        int sum = 0;
        
        //For each loop, itterates through collection
        for (int x : arr) {
            sum += x;
        }
        System.out.println("__________");
        System.out.println(sum);

    }
}
