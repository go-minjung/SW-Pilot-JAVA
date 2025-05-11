public class HelloBiodome09 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("잘못된 입력입니다. 3~100 사이의 숫자와 특수 문자를 입력하세요.");
            return;
        }

        int height;
        char centerChar;

        // 높이 유효성 검사
        try {
            height = Integer.parseInt(args[0]);
            if (height < 3 || height > 100) {
                System.out.println("잘못된 입력입니다. 3~100 사이의 숫자를 입력하세요.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("잘못된 입력입니다. 3~100 사이의 숫자를 입력하세요.");
            return;
        }

        // 특수문자 유효성 검사
        if (args[1].length() != 1 || Character.isLetterOrDigit(args[1].charAt(0))) {
            System.out.println("잘못된 입력입니다. 특수 문자 하나를 입력하세요.");
            return;
        }

        centerChar = args[1].charAt(0);

        // 나무 출력
        for (int i = 0; i < height; i++) {
            int stars = 1 + 2 * i;
            int spaces = height - i - 1;

            // 앞쪽 공백
            for (int s = 0; s < spaces; s++) System.out.print(" ");

            // 별 출력
            for (int j = 0; j < stars; j++) {
                if (j == stars / 2) System.out.print(centerChar);  // 중앙 문자
                else System.out.print("*");
            }
            System.out.println();
        }

        // 기둥 출력
        for (int s = 0; s < height - 1; s++) System.out.print(" ");
        System.out.println("|");
    }
}
