package customLinkedList;

import java.util.Iterator;

/*
-->Дмитрий Борзунов
->Попытка создания кастомного LinkedList.
->Примечание: старался, на сколько хватило знаний)))))
 */

public class MyLinkedList<E> implements Linkeded<E>, Iterable<E>,DescendingIterator<E> {
    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size = 0;

    public MyLinkedList() {
        lastNode = new Node<E>(null, firstNode, null);
        firstNode = new Node<E>(null, null, lastNode);
    }

    @Override
    public void addLast(E e) {
        Node<E> prev = lastNode;
        prev.setCurrentElem(e);
        lastNode = new Node<E>(null, prev, null);
        prev.setNextElem(lastNode);
        size++;
    }

    @Override
    public void addFirst(E e) {
        Node<E> next = firstNode;
        next.setCurrentElem(e);
        firstNode = new Node<>(null, null, next);
        next.setPreviousElem(firstNode);
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E getElementByIndex(int counter) {
        Node<E> target = firstNode.getNextElem();
        for (int i = 0; i < counter; i++) {
            target = getNextElem(target);
        }
        return target.getCurrentElem();
    }

    private Node<E> getNextElem(Node<E> current) {
        return current.getNextElem();
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int counter = 0;

            @Override
            public boolean hasNext() {
                return counter < size;
            }

            @Override
            public E next() {
                return getElementByIndex(counter++);
            }
        };
    }

    @Override
    public Iterator<E> descendingIterator() {
        return new Iterator<E>() {
            int counter = size - 1;
            @Override
            public boolean hasNext() {
                return counter >= 0;
            }

            @Override
            public E next() {
                return getElementByIndex(counter--);
            }
        };
    }

    private class Node<E> {
        private E currentElem;
        private Node<E> nextElem;
        private Node<E> previousElem;


        public Node(E currentElem, Node<E> nextElem, Node<E> previousElem) {
            this.currentElem = currentElem;
            this.nextElem = nextElem;
            this.previousElem = previousElem;
        }

        public E getCurrentElem() {
            return currentElem;
        }

        public void setCurrentElem(E currentElem) {
            this.currentElem = currentElem;
        }

        public Node<E> getNextElem() {
            return nextElem;
        }

        public void setNextElem(Node<E> nextElem) {
            this.nextElem = nextElem;
        }

        public Node<E> getPreviousElem() {
            return previousElem;
        }

        public void setPreviousElem(Node<E> previousElem) {
            this.previousElem = previousElem;
        }
    }
}
