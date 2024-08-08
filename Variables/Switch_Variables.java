public class Switch_Variables {
    public static void main() {
        String name1 = "name1";
        String name2 = "name2";
        // Now we wont to change the variables values beetwen them!
        System.out.println("Before switch: " + name1 + " " + name2);
        //let's declare a temp variable:
        String temp;
        //Now we are going to switch the values of name1 and name2
        temp = name1;
        name1 = name2;
        name2 = temp;
        System.out.println("After switch: " + name1 + " " + name2);
        //That's look good
    }
}
