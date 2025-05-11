public class HelloBiodome07 {
    public static void main(String[] args) {
        if (args.length < 1 || args[0].trim().isEmpty()) {
            System.out.println("염기서열이 입력되지 않았습니다.");
            return;
        }

        String input = args[0];
        String result = compressDNA(input);

        if (result.equals("INVALID")) {
            System.out.println("염기서열은 C, J, H, E, Y 다섯가지로만 입력됩니다. 확인하고 다시 입력해주세요");
        } else {
            System.out.println(result);
        }
    }

    public static String compressDNA(String input) {
        input = input.toUpperCase(); // 대문자로 통일

        // 보너스 과제: 공백 여러 개를 하나로 축소
        input = input.replaceAll("\\s+", " ");

        String result = "";
        char[] valid = {'C', 'J', 'H', 'E', 'Y', ' '};

        int length = input.length();
        int count = 1;

        for (int i = 0; i < length; i++) {
            char current = input.charAt(i);

            // 유효한 문자 확인
            boolean isValid = false;
            for (int j = 0; j < valid.length; j++) {
                if (current == valid[j]) {
                    isValid = true;
                    break;
                }
            }

            if (!isValid) return "INVALID";

            // 마지막 문자일 때
            if (i == length - 1) {
                result += current;
                if (current != ' ') result += count;
                break;
            }

            char next = input.charAt(i + 1);
            if (current == next) {
                count++;
            } else {
                result += current;
                if (current != ' ') result += count;
                count = 1;
            }
        }

        return result;
    }
}
