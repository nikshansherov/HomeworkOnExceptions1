public class Task1 {
    public static void main(String[] args) {
        System.out.println(arifmeticExepsion(15, 0));

        int[] arr = null;
//        int[] arr = {1, 2, 3};
        nullPointerException(arr);

        int[] arr2 = {1, 2, 3};
        int num = 5;
        arrayIndexOutOfBoundsException(num, arr2);
    }

    public static int arifmeticExepsion(int number1, int number2) {
        if (number2 == 0) throw new ArithmeticException("Ошибка - деление на ноль!");
        return number1 / number2;
    }

    public static void nullPointerException(int[] arr) {
        if (arr == null) throw new NullPointerException("Ошибка - несуществующий массив!");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void arrayIndexOutOfBoundsException(int num, int[] arr) {
        if (num > arr.length || num < 0) throw new ArrayIndexOutOfBoundsException("Ошибка! - Индекс " + num +
                " находится вне массива!");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
