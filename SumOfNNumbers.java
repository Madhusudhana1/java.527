public class SumOfNNumbers {
    public static void main(String[] args) {
        int n = 5;
        int[] numbers = {1, 2, 3, 4, 5, 6};

        int sum = 0;
        for (int i = 0; i < n; i++) {
            try {
                sum += numbers[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bounds exception occurred at index: " + i);
                e.printStackTrace();
                break;
            }
        }

        System.out.println("Sum of the first " + n + " numbers: " + sum);
    }
}
