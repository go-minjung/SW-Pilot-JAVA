// 선택 정렬 후 평균값과 중앙값 출력
public class RoadToBiodome04 {
    // 선택 정렬으로 오름차순 정렬
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n-1; i++) {
            int minIndex = i;
            for (int j=i+1; j<n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // arr[i]와 arr[minIndex] 교환
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // 평균값 계산
    public static double Average(int[] arr) {
        int sum = 0;
        for(int value : arr) {
            sum += value;
        }
        return (double) sum/arr.length;
    }

    // 중앙값 계산
    public static double Median(int[] arr) {
        int n = arr.length;
        if (n%2 == 1) {
            return arr[n/2]; // 배열 길이 홀수
        } else {
            return (arr[n/2-1]+arr[n/2])/2.0; // 배열 길이 짝수
        }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("숫자를 입력해주세요.");
            return;
        }

        // 입력값 정수 배열 저장
        int[] numbers = new int[args.length];
        for(int i=0; i<args.length; i++) {
            try {
                numbers[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력해주세요.");
                return;
            }
        }

        selectionSort(numbers);
        double average = Average(numbers);
        double median = Median(numbers);
        System.out.println("평균값 : " + average + ", 중앙값 : " + median);
    }
}
