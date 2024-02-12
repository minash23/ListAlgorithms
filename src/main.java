public class main {
    public static void main(String[] args) {
        // Create a SLlist of Books
       SLlist<Book> SLlist = new SLlist<>();

        // Add elements to the list
        SLlist.listAdd(new Book("BookZeroTitle", "Mina", 20.0));
        SLlist.listAdd(new Book("BookOneTitle", "likea", 30.0));
        SLlist.listAdd(new Book("BookTwoTitle", "Jolie", 23.0));

        // Print the initial list
        System.out.println("Initial List:");
        System.out.println(SLlist.toString());

        // Remove an element
        SLlist.listRemove(1);

        // Print the updated list
        System.out.println("List after removing element at position 1:");
        System.out.println(SLlist.toString()); // Print the result of toString() method
    }
}
