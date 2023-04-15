public class Task2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {3, 2, 1};
        int[] array = arrayВifference(arr1, arr2);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] arrayВifference(int[] arr1, int[] arr2) {
        int[] array = new int[arr1.length];
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Ошибка - длины массивов не равны!");
        }
        for (int i = 0; i < arr1.length; i++) {
            array[i] = arr1[i] - arr2[i];
        }
        return array;
    }
}
