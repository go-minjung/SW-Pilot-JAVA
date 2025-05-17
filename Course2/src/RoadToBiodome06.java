public class RoadToBiodome06 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("두 배열을 입력하세요.");
            return;
        }


    }

    // 평균값 계산
    private static double caculateMean(int[] arr1, int[] arr2) {
        int sum = 0, count = 0;
        for (int num : arr1) {
            sum += num;
            count++;
        }
        for (int num : arr2) {
            sum += num;
            count++;
        }
        return Math.round((sum / (double) count) * 10) / 10.0;
    }

    // 중앙값 계산

}
