import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondLesson {
    private static void replaceArray(int arr2[]) {
        for (int i = 0; i < arr2.length; i++) arr2[i] = (arr2[i] == 0) ? 1 : 0;
    }

    private static void fillArray(int arr2[]) {
        for (int i = 0, j = 1; i < arr2.length; i++, j = j + 3) arr2[i] = j;
    }

    private static void multiplicationArray(int arr2[]) {
        for (int i = 0; i < arr2.length; i++)
            if (arr2[i] < 6) arr2[i] = arr2[i] * 2;
    }

    private static int minElement(int arr2[]) {
        int min = arr2[0];
        for (int i = 1; i < arr2.length; i++)
            if (arr2[i] < min) min = arr2[i];
        return min;
    }

    private static int maxElement(int arr2[]) {
        int max = arr2[0];
        for (int i = 1; i < arr2.length; i++)
            if (arr2[i] > max) max = arr2[i];
        return max;
    }

    private static void diagonalFill(int arr2[][]) {
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++)
                if (i == j) arr2[i][j] = 1;
        }

    }

    private static boolean checkBalance(int arr2[]) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr2.length; i++) {
            start = start + arr2[i];
            for (int j = i + 1; j < arr2.length; j++) end = end + arr2[j];
            if (start == end) return true;
            end = 0;
        }
        return false;
    }

    private static void shiftElements(int arr2[], int n) {
        int tempNumber;
        if (n >= 0) {
            for (int i = 0; i < n; i++) {
                tempNumber = arr2[0];
                arr2[0] = arr2[arr2.length - 1];
                for (int j = 1; j < arr2.length - 1; j++) {
                    arr2[arr2.length - j] = arr2[arr2.length - j - 1];
                }
                arr2[1] = tempNumber;
            }
        } else {
            for (int i = 0; i > n; i--) {
                tempNumber = arr2[arr2.length - 1];
                arr2[arr2.length - 1] = arr2[0];

                for (int j = 1; j < arr2.length - 1; j++) {
                    arr2[j - 1] = arr2[j];
                }

                arr2[arr2.length - 2] = tempNumber;
            }
        }
    }

    public static void main(String[] args) {

        //Задание 1
        int arr[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        replaceArray(arr);
        System.out.println("Задание 1. Выходной массив = " + Arrays.toString(arr));

        //Задание 2
        int[] massive2 = new int[8];
        fillArray(massive2);
        System.out.println("Задание 2. Выходной массив = " + Arrays.toString(massive2));

        //Задание3
        int massive3[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplicationArray(massive3);
        System.out.println("Задание 3. Выходной массив = " + Arrays.toString(massive3));

        //Задание 4
        int massive4[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1, 17, -5, -10};
        System.out.println("Задание 4. Массив = " + Arrays.toString(massive4) + " Максимальный элемент = " + maxElement(massive4) + " Минимальный элемент = " + minElement(massive4));

        //Задание 5
        int massive5[][] = {
                {3, 5, 6, 7, 2, 3},
                {3, 5, 6, 7, 2, 3},
                {3, 5, 6, 7, 2, 3},
                {3, 5, 6, 7, 2, 3},
                {3, 5, 6, 7, 2, 3},
                {3, 5, 6, 7, 2, 3}
        };
        diagonalFill(massive5);
        System.out.println("Задание 5.");
        for (int i = 0; i < massive5.length; i++) {
            System.out.println(Arrays.toString(massive5[i]));
        }

        //Задание 6
        int massive6[] = {1, 5, 3, 2, 1};
        System.out.println("Задание 6. Массив = " + Arrays.toString(massive6) + " Результат = " + checkBalance(massive6));

        //Задание 7,8
        int massive7[] = {4, 56, 7, 8, 4, 9, 5, 43, 567, 3};
        System.out.println("Задание 7, 8. Входной массив = " + Arrays.toString(massive7) + " Смещение = 4");
        shiftElements(massive7, 4);
        System.out.println("Выходной массив = " + Arrays.toString(massive7));

        System.out.println("Задание 7, 8. Входной массив = " + Arrays.toString(massive7) + " Смещение = -4");
        shiftElements(massive7, -4);
        System.out.println("Выходной массив = " + Arrays.toString(massive7));

    }
}
