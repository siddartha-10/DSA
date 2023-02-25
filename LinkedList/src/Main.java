public class Main {
    public static void main(String[] args) {
        LL list= new LL();
        list.insertFirst(5);
        list.insertLast(25);
        list.insertFirst(15);
        list.insert(20,2);
        System.out.println(list.deleteFirst());
        list.display();
    }
}
