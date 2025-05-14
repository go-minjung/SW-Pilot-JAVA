// 반복되지 않는 파동수 찾기 (입력된 파동수 중 한번만 등장한 수 출력)
public class RoadToBiodome01 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("파동수를 입력하세요.");
            return;
        }

        // 입력값 정수 배열 저장
        int[] numbers = new int[args.length];
        for (int i = 0; i<args.length; i++) {
            try {
                int num = Integer.parseInt(args[i]);
                if (num < 0 || num > 1000) {
                    System.out.println("입력된 값의 범위가 올바르지 않습니다. 0에서 1000까지의 값을 입력해주세요.");
                    return;
                }
                numbers[i] = num;
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력해주세요.");
                return;
            }
        }

        // 반복되지 않는 수 찾기
        int uniqueNumber = findUniqueNumber(numbers);
        if (uniqueNumber == -1) {
            System.out.println("반복되지 않는 숫자가 없습니다.");
        } else {
            System.out.println("반복되지 않는 숫자: " + uniqueNumber);
        }
    }

    static int findUniqueNumber(int[] nums) {
        int unique = -1;
        // 모든 수 등장 횟수 검사
        for (int i = 0; i<nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) count++;
            }
            // 등장 횟수 1인 경우
            if (count == 1) {
                unique = nums[i];
                break;
            }
        }
        return unique;
    }
}
