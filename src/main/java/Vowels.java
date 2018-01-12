public class Vowels {
    public static int getCount(String str) {
        String[] s = str.split("");

        int vowelsCount = 0;

        String[] array = new String[]{"a", "e", "i", "o", "u"};

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (s[i].equals(array[j]))
                    vowelsCount++;
            }
        }

        return vowelsCount;
    }
}