public class RuleOfBiodome05 {

    public static void main(String[] args) {
        PlantHashMap<String, String> plantMap = new PlantHashMap<>();

        // 식물 10개 추가
        plantMap.put("장미", "장미는 관상용으로 많이 재배되는 화초 중 하나이다.");
        plantMap.put("해바라기", "해바라기는 태양을 따라 움직이는 것으로 알려져 있다.");
        plantMap.put("민들레", "민들레는 약용으로도 사용되는 풀이다.");
        plantMap.put("튤립", "튤립은 봄에 피는 구근식물이다.");
        plantMap.put("선인장", "선인장은 건조한 지역에서 자라는 다육식물이다.");
        plantMap.put("연꽃", "연꽃은 물 위에서 자라는 아름다운 꽃이다.");
        plantMap.put("코스모스", "코스모스는 가을을 대표하는 꽃이다.");
        plantMap.put("벚꽃", "벚꽃은 봄철에 아름답게 피는 꽃으로 유명하다.");
        plantMap.put("무궁화", "무궁화는 대한민국의 국화이다.");
        plantMap.put("아카시아", "아카시아는 향기로운 꽃을 피우는 나무이다.");

        System.out.println();

        // 식물 특징 검색
        plantMap.get("장미");
        plantMap.get("해바라기");

        System.out.println();

        // 식물 삭제
        plantMap.remove("민들레");

        System.out.println();

        // 인덱스 출력
        System.out.println("'장미' 인덱스: " + plantMap.getIndex("장미"));
        System.out.println("'해바라기' 인덱스: " + plantMap.getIndex("해바라기"));
    }
}
