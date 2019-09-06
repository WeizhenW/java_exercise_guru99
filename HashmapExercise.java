import java.util.HashMap;
class HashmapExercise{
    public static void main(String[] args){
        HashMap<String, Integer> testScore = new HashMap<String, Integer>();
        testScore.put("bear", 90);
        testScore.put("panda", 85);
        testScore.put("dolphin", 100);

        //get value by key
        System.out.println("panda's score is " + testScore.get("panda"));
        //remove key value pair by key
        testScore.remove("bear");
        System.out.println("the HashMap after removing bear is " + testScore);

        //contain a key
        System.out.println("does contain dolphin? " + testScore.containsKey("dolphin"));
        System.out.println("does contain bear? " + testScore.containsKey("bear"));

        //all the keys
        System.out.println("all keys " + testScore.keySet());

        //all values
        System.out.println("all values" + testScore.values());

        //is empty?
        System.out.println("is the hashmap empty? " + testScore.isEmpty());
    }
}