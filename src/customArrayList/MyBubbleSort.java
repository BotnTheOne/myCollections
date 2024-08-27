package customArrayList;

/*
-->Дмитрий Борзунов
->Кастомная сортировка пузырьком.
 */

public class MyBubbleSort {

    static void bubbleSort(MyArrayList<Integer> e) {
        int n = e.size();
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (e.get(j) > e.get(j + 1)) {
                    int temp = e.get(j);
                    e.update(j, e.get(j + 1));
                    e.update(j + 1, temp);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
