package customArrayList;

/*
-->Дмитрий Борзунов
->Ручное тестирование функционала кастомного ArrayList.
 */

public class Main {
    public static void main(String[] args) {
        customArrayList.MyArrayList<Integer> strings = new customArrayList.MyArrayList<>();
        strings.add(1);
        strings.add(3);
        strings.add(5);
        strings.add(2);

        System.out.println(strings.get(1));
        System.out.println(strings.size());
        strings.delete(1);

        System.out.println(strings.get(1));
        System.out.println(strings.size());
        customArrayList.MyBubbleSort.bubbleSort(strings);
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }
}