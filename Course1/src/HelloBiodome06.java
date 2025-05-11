public class HelloBiodome06 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("두 개의 유전자 코드를 입력해주세요.");
            return;
        }

        String gene1 = args[0];
        String gene2 = args[1];

        if (isSame(gene1, gene2)) {
            System.out.println("동일한 유전자 코드입니다.");
        } else {
            System.out.println("일치하지 않습니다.");
        }

        if (isPartialMatch(gene1, gene2)) {
            System.out.println("부분적으로 포함됩니다.");
        } else {
            System.out.println("포함되지 않습니다.");
        }
    }

    public static boolean isSame(String a, String b) {
        int i = 0;
        if (a.length() != b.length()) return false;
        while (i < a.length()) {
            if (a.charAt(i) != b.charAt(i)) return false;
            i++;
        }
        return true;
    }

    public static boolean isPartialMatch(String a, String b) {
        int i = 0;
        while (i <= b.length() - a.length()) {
            int j = 0;
            while (j < a.length() && b.charAt(i + j) == a.charAt(j)) {
                j++;
            }
            if (j == a.length()) return true;
            i++;
        }
        return false;
    }
}
