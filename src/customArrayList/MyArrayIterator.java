package customArrayList;

import java.util.Iterator;

/*
-->Дмитрий Борзунов
->Кастомный итерато был создан для понимания итерации по ArrayList.
 */

public class MyArrayIterator<E> implements Iterator<E> {
    private int index = 0;
    E[] values;

    MyArrayIterator(E[] values) {
        this.values = values;
    }
    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public E next() {
        if (hasNext()) {
            return values[index++];
        }
        return null;
    }
}
