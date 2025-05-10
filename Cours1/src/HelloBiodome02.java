public class HelloBiodome02 {
    // 태양광, 풍력, 지열 에너지 생산량 입력받아 합계 출력
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("에너지 생산량 3개(태양광, 풍력, 지열)를 입력해주세요.");
            return;
        }

        int[] energy = new int[3];
        String[] names = { "태양광", "풍력", "지열" };
        int total = 0;

        try {
            for (int i = 0; i < 3; i++) {
                energy[i] = Integer.parseInt(args[i]);
                if (energy[i] < 0 || energy[i] > 30000) {
                    System.out.println("에너지 생산량은 0 이상 30000 이하의 정수여야 합니다.");
                    return;
                }
                total += energy[i];
            }
        } catch (NumberFormatException e) {
            System.out.println("정수 값을 입력해주세요.");
            return;
        }

        System.out.println("총 에너지 사용량은 " + total + "입니다.");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%s %.9f%%\n", names[i], energy[i] * 100.0 / total);
        }
    }
}
