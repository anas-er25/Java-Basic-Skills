public class ArrayBaiscs {
    public static void main(String[] args) {
        int[] grades = { 72, 84, 63, 55, 98 };
        int min = grades[0]; // set min to the first element in the array

        for (int i : grades) { // enhanced for loop
            if (i < min) { // if element is less than min
                min = i; // set min to element that is less
            }
        }
        // elements are not modified so enhanced for loop can be used

        System.out.println("The lowest grade is " + min); // print lowest element
    }
}