class ArrayExercise{

    public static void passByReference(int[] array, int index) {
        array[index] = 999;
    }
    public static void main(String[] args){
        //declare and initialize an array with 10 int values
        int[] numArray = new int[10];
        //loop through to pass value into the array
        for(int count=0; count<10; count++){
            numArray[count] = count * 100;
        }
        //print out array values
        for(int count=0; count<10; count++){
            System.out.println("value at index " + count + " is " + numArray[count]);
        }
        //print out length
        System.out.println("array length is " + numArray.length); 

        // call method to change array
        ArrayExercise.passByReference(numArray, 5);

        //print out changed array values
        for(int count=0; count<10; count++){
            System.out.println("value at index " + count + " is " + numArray[count]);
        }
    }
    
}