package customLinkedList;

/*
-->Дмитрий Борзунов
->Кастомный интерфейс для LinkedList.
 */

public interface Linkeded<E> {
    void addLast(E e);
    void addFirst(E e);
    int size();
    E getElementByIndex(int counter);
}
