import static java.util.Arrays.binarySearch;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        class RecursionEx {

            public static void printHelloWorld(int n) {
                if (n <= 0) return;
                System.out.println("Hello World");
                printHelloWorld(n - 1);
            }

            public static int sumMultiplesOf7(int n1, int n2) {
                if (n1 > n2) return 0;
                if (n1 % 7 == 0) {
                    return n1 + sumMultiplesOf7(n1 + 1, n2);
                } else {
                    return sumMultiplesOf7(n1 + 1, n2);
                }
            }

            public static int binarySearch(int[] arr, int target, int left, int right) {
                if (left > right) return -1;
                int mid = left + (right - left) / 2;
                if (arr[mid] == target) return mid;
                if (arr[mid] > target) return binarySearch(arr, target, left, mid - 1);
                return binarySearch(arr, target, mid + 1, right);
            }

            public static void main(String[] args) {

                printHelloWorld(3);


                System.out.println("Sum of multiples of 7 between 1 and 30: " + sumMultiplesOf7(1, 30));


                int[] arr = {1, 3, 5, 7, 9, 11, 13};
                int target = 7;
                int result = binarySearch(arr, target, 0, arr.length - 1);
                System.out.println("Index of " + target + " = " + result);
            }
        }

    }
    }
