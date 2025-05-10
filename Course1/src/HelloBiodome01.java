public class HelloBiodome01 {
    // 이름 입력받아 환영인사 출력
    public static void main(String[] args) {
        if (args.length == 0 || args[0].isEmpty()) {
            System.out.println("이름을 입력해주세요.");
            return;
        }
        String name = args[0];
        System.out.println("반갑습니다, \"" + name + "\"님");
    }
}