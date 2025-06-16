import java.util.*;

public class RuleOfBiodome06 {
    public static void main(String[] args) {
        if (args.length < 20) {
            System.out.println("20마리 이상의 동물 이름을 입력해야 합니다.");
            return;
        }

        AnimalFrequencyAnalyzer analyzer = new AnimalFrequencyAnalyzer();

        // 동물 분석
        analyzer.analyze(args);

        // 가장 많이 발견된 동물 출력
        List<String> mostFrequent = analyzer.getMostFrequentAnimals();
        System.out.print("가장 많이 발견된 동물 : ");
        System.out.println(String.join(", ", mostFrequent));

        // 고유 동물 출력
        Set<String> uniqueAnimals = analyzer.getUniqueAnimals();
        System.out.print("관찰된 모든 동물 : ");
        // 정렬된 출력 (선택적)
        List<String> sorted = new ArrayList<>(uniqueAnimals);
        Collections.sort(sorted);
        System.out.println(String.join(", ", sorted));
    }
}
