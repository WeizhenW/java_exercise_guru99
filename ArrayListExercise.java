import java.util.ArrayList;
class ArrayListExercise{
    public static void main(String[] args){
        //create an arraylist
        ArrayList<String> animalArrayList = new ArrayList<String>();
        //size of arraylist
        System.out.println("size of the arraylist is " + animalArrayList.size());
        //add element
        animalArrayList.add("bear");
        animalArrayList.add("camel");
        animalArrayList.add("wolf");
        animalArrayList.add("panda");
        
        //new size of the arraylist
        System.out.println("new size is " + animalArrayList.size());
        //remove element
        animalArrayList.remove("bear");
        animalArrayList.remove(1);
        //print out arraylist
        System.out.println("arraylist is " + animalArrayList);
        //get value at certain index
        for(int count=0; count<animalArrayList.size(); count++){
            System.out.println("value at index " + count + " is " + animalArrayList.get(count));
        }
    }
}