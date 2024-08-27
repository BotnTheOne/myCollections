package customLinkedList;

/*
-->Дмитрий Борзунов
->Ручное тестирование функционала кастомного LinkedList.
 */

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.addFirst("First commit");
        linkedList.addLast("Next commit");

        for (String s : linkedList){
            System.out.println(s);
        }
    }
}
