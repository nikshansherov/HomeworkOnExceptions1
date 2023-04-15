public class Task3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {3, 2, 1};
        float[] array = quotientOfArrayDivision(arr1, arr2);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static float[] quotientOfArrayDivision(int[] arr1, int[] arr2) {
        if (arr1 == null | arr2 == null) {
            throw new RuntimeException("Ошибка - обращение к несуществующему массиву!");
        }
        float[] array = new float[arr1.length];
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Ошибка - длины массивов не равны!");
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("Ошибка - деление на ноль!");
            }
            array[i] = arr1[i] / arr2[i];
        }
        return array;
    }
}
