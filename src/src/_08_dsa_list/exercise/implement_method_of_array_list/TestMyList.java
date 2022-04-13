package _08_dsa_list.exercise.implement_method_of_array_list;

public class TestMyList {
    public static void main(String[] args) {
        Object[] newMyArray = new Object[10];
        newMyArray[0] = 1;
        newMyArray[1] = 2;
        newMyArray[2] = 3;
        MyList<Integer> myList = new MyList<>();
        myList.add(0, 4);
        myList.add(1, 5);
        myList.add(2, 6);
        myList.add(3, 7);

        System.out.println(myList.toString());
        System.out.println(myList.remove(1));
        System.out.println(myList.toString());
        System.out.println(myList.size());
        myList.add(0, 10);
        System.out.println(myList.toString());
        myList.clear();
        System.out.println(myList.toString());
        System.out.println(myList.size());

    }

}
