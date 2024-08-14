import java.util.ArrayList; // import the ArrayList class

public class ArrayLists {
    public static void main(String[] args) {
        // ADD() AND REMOVE() 
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(50);
        numbers.add(100);
        System.out.println(numbers);
        // [50,100]
        numbers.add(0, 12); // add 12 as an element to index 0
        numbers.add(2, 75); // add 75 as an element to index 2
        numbers.remove(1); // remove the element on index 1
        System.out.println(numbers);
        // [12, 75, 100]

        // GET() AND SET()
        ArrayList<String> contact = new ArrayList<String>();
        contact.add("First name");
        contact.add("Last name");
        contact.add("Phone number");
        System.out.println(contact);

        contact.set(2, "Email"); // change element at index 2 to "Email"
        System.out.println(contact);
        System.out.println(contact.get(0));
    }
}
