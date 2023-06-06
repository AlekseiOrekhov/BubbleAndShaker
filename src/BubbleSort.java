public class BubbleSort {
    public int[] sort(int[] input) {
        boolean isSorted = false;
        int count = 0;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < input.length - 1 - count; i++) {
                if (input[i] > input[i+1]) {
                    isSorted = false;
                    int local = input[i+1];
                    input[i+1] = input[i];
                    input[i] = local;

                }
            }
            count++;
        }
        return input;
    }
}
