// 동식물 정보 관리 클래스
public class Organism {
    // 필드(Field): 객체가 가지는 데이터
    private String name;
    private String species;
    private String habitat;

    // 생성자(Constructor): 객체가 생성되면 호출, 필드 초기화
    public Organism(String name, String species, String habitat) {
        this.name = name;
        this.species = species;
        this.habitat = habitat;
    }

    // 서식지 변경 메서드
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    // 이름 확인 메서드
    public String getName() {
        return name;
    }

    // 객체 정보 출력 메서드
    public void displayInfo() {
        System.out.println(name + ", " + species + ", " + habitat);
    }
}
