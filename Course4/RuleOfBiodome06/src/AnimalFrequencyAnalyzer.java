import java.util.*;

public class AnimalFrequencyAnalyzer {
    private Map<String, Integer> animalCountMap;

    public AnimalFrequencyAnalyzer() {
        animalCountMap = new HashMap<>();
    }

    // 동물 데이터 분석
    public void analyze(String[] animals) {
        for (String animal : animals) {
            animalCountMap.put(animal, animalCountMap.getOrDefault(animal, 0) + 1);
        }
    }

    // 가장 많이 출현한 동물 목록 반환
    public List<String> getMostFrequentAnimals() {
        List<String> result = new ArrayList<>();
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : animalCountMap.entrySet()) {
            int count = entry.getValue();
            if (count > maxCount) {
                maxCount = count;
                result.clear();
                result.add(entry.getKey());
            } else if (count == maxCount) {
                result.add(entry.getKey());
            }
        }

        return result;
    }

    // 고유 동물 목록 반환
    public Set<String> getUniqueAnimals() {
        return animalCountMap.keySet();
    }
}
