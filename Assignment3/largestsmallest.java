public class largestsmallest {
    public static void main(String[] args) {
        int x[] = {1,3,6,4,7,9,2,8,5};
        int small = x[0], big = x[0];

        for (int i = 1; i < x.length; i++) {
            if (x[i] < small)
                small = x[i];
            else if (x[i] > big)
                big = x[i];
        }
        System.out.printf("Smallest = %d & Biggest = %d", small, big);
    }
}
