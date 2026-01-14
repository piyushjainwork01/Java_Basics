package prefix;

public class PrefixSumExample {

    public static void main(String[] args) {

        int[] arr = new int[]{2, 1, 3, 4, 5};

        int[] pref = prefixSumArray(arr);
        printArray(pref);

    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    // TODO but in question they ask us to not create any new array. i mean in place hona chahiye no extra memory.
    public static int[] prefixSumArray(int[] arr) {
        int n = arr.length;
      //  int[] pref = new int[n];

      //  pref[0] = arr[0];

        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }

        return arr;

    }
}
