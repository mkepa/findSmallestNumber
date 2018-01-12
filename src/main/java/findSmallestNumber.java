public class findSmallestNumber {

    public static int findSmallestInt(int[] args) {
        int smallestNumber = args[0];

        for (int i = 1; i < args.length; i++) {
            if (smallestNumber > args[i])
                smallestNumber = args[i];
        }

        return smallestNumber;
    }
}
