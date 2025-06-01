// 동식물 정보 관리 클래스
public class Organism {
    // 필드(Field): 객체가 가지는 데이터
    private String name;
    private String species;
    private String habitat;

    // 생성자: 객체가 생성되면 호출, 필드 초기화
    public Organism(String name, String species, String habitat) {
        this.name = name;
        this.species = species;
        this.habitat = habitat;
    }

    // Getter: 이름 확인 메서드
    public String getName() {
        return name;
    }

    // Getter: 종 확인 메서드
    public String getSpecies() {
        return species;
    }

    // Getter: 서식지 확인 메서드
    public String getHabitat() {
        return habitat;
    }

    // 정보 출력 메서드
    public void displayInfo() {
        System.out.println(name + ", " + species + ", " + habitat);
    }
}
