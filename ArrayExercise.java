class ArrayExercise{
    public static void main(String[] args){
        int[] numArray = new int[10];
        for(int count=0; count<10; count++){
            numArray[count] = count * 100;
        }
        for(int count=0; count<10; count++){
            System.out.println("value at index " + count + " is " + numArray[count]);
        }
        System.out.println("array length is " + numArray.length); 
    }
    
}