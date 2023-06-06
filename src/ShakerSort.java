public class ShakerSort {
    public int[] sort(int[] input) {
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i] > input[i+1]) {
                    isSorted = false;
                    int local = input[i+1];
                    input[i+1] = input[i];
                    input[i] = local;
                }
            }
            if (isSorted) {
                return input;
            }
            for (int i = input.length - 1; i > 0; i--) {
                if (input[i] < input[i - 1]) {
                    int local = input[i - 1];
                    input[i - 1] = input[i];
                    input[i] = local;
                }
            }
        }
        return input;
    }
}
