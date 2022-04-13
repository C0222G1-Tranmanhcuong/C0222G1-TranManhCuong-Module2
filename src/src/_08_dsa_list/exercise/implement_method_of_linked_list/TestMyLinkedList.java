package _08_dsa_list.exercise.implement_method_of_linked_list;

public class TestMyLinkedList {
    public static void main(String[] args) {


        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.addFirst(11);
        myLinkedList.addFirst(12);
        myLinkedList.addFirst(13);

        System.out.println(myLinkedList.toString());
        myLinkedList.addLast(14);
        System.out.println(myLinkedList.toString());
        System.out.println(myLinkedList.remove(2));
        System.out.println(myLinkedList.toString());
    }
}
