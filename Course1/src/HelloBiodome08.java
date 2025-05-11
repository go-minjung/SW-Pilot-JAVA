public class HelloBiodome08 {

    public static void main(String[] args) {
        if (args.length < 1 || args[0].trim().isEmpty()) {
            System.out.println("공백 없는 메시지를 입력해주세요.");
            return;
        }

        String input = args[0];
        if (input.length() > 100) {
            System.out.println("메시지는 최대 100자까지 입력 가능합니다.");
            return;
        }

        // 영문 소문자 또는 ? 만 허용
        if (!input.matches("[a-z?]+")) {
            System.out.println("메시지는 영문 소문자와 물음표(?)만 입력 가능합니다.");
            return;
        }

        String[] dictionary = {
                "hello", "where", "this", "biodome", "help", "tree", "new", "is", "problem",
                "please", "need", "we", "isn’t", "there", "a", "your", "any", "thanks", "the",
                "for", "solution", "can", "?"
        };

        String result = splitMessage(input, dictionary);
        System.out.println(result);
    }

    public static String splitMessage(String input, String[] dictionary) {
        boolean endsWithQuestion = input.endsWith("?");

        // 길이 기준으로 내림차순 정렬 (긴 단어 먼저 매칭되도록)
        for (int i = 0; i < dictionary.length - 1; i++) {
            for (int j = i + 1; j < dictionary.length; j++) {
                if (dictionary[i].length() < dictionary[j].length()) {
                    String temp = dictionary[i];
                    dictionary[i] = dictionary[j];
                    dictionary[j] = temp;
                }
            }
        }

        StringBuilder output = new StringBuilder();
        int i = 0;
        int len = input.length();

        while (i < len) {
            boolean matched = false;
            for (String word : dictionary) {
                int wordLen = word.length();
                if (i + wordLen <= len) {
                    String sub = input.substring(i, i + wordLen);
                    if (sub.equals(word)) {
                        if (!output.isEmpty()) output.append(" ");
                        output.append(sub);
                        i += wordLen;
                        matched = true;
                        break;
                    }
                }
            }

            if (!matched) {
                // 사전에 없는 단어는 그대로 붙여서 출력하되 앞뒤 사전 단어와 띄어쓰기
                int j = i + 1;
                while (j <= len) {
                    String unknown = input.substring(i, j);
                    boolean found = false;
                    for (String word : dictionary) {
                        if (unknown.equals(word)) {
                            found = true;
                            break;
                        }
                    }
                    if (found) break;
                    j++;
                }
                if (!output.isEmpty()) output.append(" ");
                output.append(input.substring(i, j - 1));
                i = j - 1;
            }
        }

        // 문장부호 처리
        if (!endsWithQuestion) output.append(".");
        return output.toString();
    }
}
