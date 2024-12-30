public class Main {
        public static int isCentered(int[] A) {
            int n = A.length;
            if (n % 2 == 0) return 0; // Array length is even, so it can't be centered

            int middleIndex = n / 2;
            int middleValue = A[middleIndex];

            for (int i = 0; i < n; i++) {
                if (i != middleIndex && A[i] <= middleValue) {
                    return 0;
                }
            }
            return 1;
        }

        public static void main(String[] args) {
            int[] array1 = {3, 2, 1, 4, 5};
            int[] array2 = {1, 2, 3, 4, 5};
            System.out.println(isCentered(array1)); // Output: 1
            System.out.println(isCentered(array2)); // Output: 0
        }

}