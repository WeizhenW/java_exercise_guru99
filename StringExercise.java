class StringExercise{
    public static void main(String[] args) {
        String animal1 = "camel";
        String animal2 = "panda";
        //concat
        String twoAnimals = animal1.concat(animal2);
        System.out.println("the concat result is " + twoAnimals);
        //get length
        System.out.println("The length of result is " + twoAnimals.length());
        //get index
        System.out.println("The index of letter e is " + twoAnimals.indexOf("e"));
        System.out.println("The letter at index 5 is " + twoAnimals.charAt(5));

        //strings compare to
        //return 0 if match
        String animal3 = "Camel";
        System.out.println("compare animal1 and animal2 " + animal1.compareTo(animal3));
        System.out.println("compare animal1 and animal2 " + animal1.compareToIgnoreCase(animal3));

        //string contain
        //return boolean 
        System.out.println("twoAnimals contains animal 1 " + twoAnimals.contains(animal1));

        //end with
        System.out.println("end with el " + animal1.endsWith(("el")));
        System.out.println("end with el " + animal2.endsWith(("el")));

        //toLowercase and toUppercase
        System.out.println("lower case " + animal1.toLowerCase());
        System.out.println("upper case " + animal1.toUpperCase());

        //convert string to integer
        String numOfChickens = "120";
        System.out.println("total number of legs is " + Integer.parseInt(numOfChickens) * 2);
    } 
}