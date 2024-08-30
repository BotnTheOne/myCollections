package customArrayList;

import java.util.Iterator;

/*
-->Дмитрий Борзунов
->Кастомный ArrayList.
->Примечание: не реализовал метод addAll.
 */

public class MyArrayList<E> implements MyCollection<E> {
    private E[] values;
    private final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        values = (E[]) new Object[DEFAULT_CAPACITY];
    }

    @Override
    public boolean add(E e) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = e;
            return true;
        } catch (ClassCastException exception) {
            exception.printStackTrace();
        }
        return false;
    }

    @Override
    public void delete(int index) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            int amountElemAfterIndex = temp.length - index - 1;
            System.arraycopy(temp, index + 1, values, index, amountElemAfterIndex);
        } catch (ClassCastException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, E e) {
        values[index] = e;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyArrayIterator<>(values);
    }
}
