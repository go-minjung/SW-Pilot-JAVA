// 두 배열 입력받아 합치고 퀵 정렬
public class RoadToBiodome05 {

    // 퀵 정렬
    public static void quickSort(int[] arr, int start, int end) {
        if (start>=end) return;
        // 가장 왼쪽값 pivot, 비교는 start+1부터
        int pivot = arr[start];
        int left = start+1;
        int right = end;

        while (left<=right) {
            while (left<=end && arr[left]<=pivot) left++;
            while (right>start && arr[right]>pivot) right--;
            if (left<right) swap(arr, left, right);
        }
        swap(arr, start, right);
        quickSort(arr, start, right-1);
        quickSort(arr, right+1, end);

    }

    // arr[i]와 arr[j] swap
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("두 배열을 입력하세요.");
            return;
        }

        try {
            StringBuilder input = new StringBuilder();
            for (String arg : args) {
                input.append(arg).append(" ");
            }
            String cleanedInput = input.toString().replace("[", "").replace("]", "").replace(",", " ");
            String[] numbers = cleanedInput.split("\\s+");
            int[] heights = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                heights[i] = parseHeight(numbers[i]);
            }

            // 퀵 정렬
            quickSort(heights, 0, heights.length-1);
            for (int i=0; i<heights.length; i++) {
                System.out.print(heights[i]);
                if (i != heights.length - 1) System.out.print(", ");
            }
            System.out.println();

        } catch (NumberFormatException e) {
            System.out.println("숫자를 입력해주세요.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
    private static int parseHeight(String input) {
        int height = Integer.parseInt(input.trim());
        if (height<0) {
            throw new IllegalArgumentException("물 높이는 0이상이어야 합니다.");
        }
        return height;
    }
}
