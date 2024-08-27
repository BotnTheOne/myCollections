package customArrayList;

/*
-->Дмитрий Борзунов
->Кастомный интерейс коллекций.
 */
public interface MyCollection<E> extends Iterable<E> {
    boolean add(E e);
    void delete(int index);
    E get(int index);
    int size();
    void update(int index, E e);
}