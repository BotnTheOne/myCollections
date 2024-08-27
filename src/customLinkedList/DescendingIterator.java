package customLinkedList;

import java.util.Iterator;

/*
-->Дмитрий Борзунов
->Кастомный итератор с конца в начало по LinkedList.
 */

public interface DescendingIterator<E> {
    Iterator<E> descendingIterator();
}
