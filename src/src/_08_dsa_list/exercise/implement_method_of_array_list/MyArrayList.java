package _08_dsa_list.exercise.implement_method_of_array_list;

import java.util.Arrays;

public class MyArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        elements = new Object[capacity];
    }

    public int size() {
        return size;
    }


    public void clear() {
        elements = Arrays.copyOf(elements, 0);
        size = 0;
    }

    public void add(int index, E element) {
        ensureCapacity();
        elements[index] = element;
        size++;
    }

    public boolean add(E e) {
        if (elements.length == size) {
            ensureCapacity();
        }
        elements[size] = e;
        size++;
        return true;

    }

    public E clone(Object[] newArray) {
        elements = newArray;
        return (E) elements;
    }

    public E remove(int index) {
        Object valueRemove = elements[index];
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return (E) valueRemove;

    }


    public boolean contains(E e) {
        for (Object element : elements) {
            if (element == e) {
                return true;
            }
        }
        return false;
    }

    public void ensureCapacity() {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, (elements.length * 2));
        }

    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public E get(int i) {
        return (E) elements[i];
    }

    @Override
    public String toString() {
        return "MyList:" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements);
    }
}
