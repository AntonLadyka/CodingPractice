/*
Напиши метод, который возвращает минимальное число в массиве и его позицию (индекс).
*/

package Kata.Other;

import java.util.Comparator;
import java.util.stream.IntStream;

public class ArrayMinAndIndex {
    private static final int LENGTH = 100_000_000;

    public static void main(String[] args) {
    int[] arr = new int[LENGTH];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * Integer.MAX_VALUE);
        }

        Pair<Integer, Integer> pair;
        long time = System.currentTimeMillis();
        pair = getMinAndIndexStream(arr);
        long timePassed = System.currentTimeMillis() - time;
        System.out.println("\n\n");
        System.out.println("Реализация через потоки.\nДлинна масива: " + LENGTH);
        System.out.printf("Результат поиска: \nзначение: %d\nиндекс: %d\n", pair.x, pair.y);
        System.out.printf("Исполнено за %dмс.", timePassed);

        time = System.currentTimeMillis();
        pair = getMinAndIndexFor(arr);
        timePassed = System.currentTimeMillis() - time;
        System.out.println("\n\n");
        System.out.println("Реализация через цикл.\nДлинна масива: " + LENGTH);
        System.out.printf("Результат поиска: \nзначение: %d\nиндекс: %d\n", pair.x, pair.y);
        System.out.printf("Исполнено за %dмс.", timePassed);

    }

    public static Pair<Integer, Integer> getMinAndIndexFor(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }

        int index = 0;
        int value = array[0];
        for (int i = 1; i < array.length; i++) {
            if (value > array[i]) {
                index = i;
                value = array[i];
            }
        }

        return new Pair<>(value, index);
    }

    public static Pair<Integer, Integer> getMinAndIndexStream(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }

        return IntStream.range(0, array.length-1)
                .boxed()
                .map(i -> new Pair<>(array[i], i))
                .min(Comparator.comparingInt(p -> p.x))
                .get();
    }

    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
