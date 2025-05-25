// 동식물 객체 관리 클래스
import java.util.ArrayList;

public class LifeNest {
    private ArrayList<Organism> organismList;

    // 생성자: OrganismList 초기화
    public LifeNest() {
        organismList = new ArrayList<>();
    }

    // Organism 객체 리스트에 추가, 출력
    public void addOrganism(Organism organism) {
        organismList.add(organism);
        System.out.println("[LifeNest] " + organism.getName() + "이(가) 추가되었습니다.");
    }

    // Organism 객체 삭제
    public void removeOrganism(String name) {
        for (int i = 0; i < organismList.size(); i++) {
            if (organismList.get(i).getName().equals(name)) {
                System.out.println("[LifeNest] " + name + "이(가) 삭제되었습니다.");
                organismList.remove(i);
                return;
            }
        }
        System.out.println("[LifeNest] " + name + "을(를) 찾을 수 없습니다.");
    }

    // 모든 객체 출력
    public void displayAllOrganisms() {
        System.out.print("전체 동식물 목록 출력:\n");
        for (Organism organism : organismList) {
            organism.displayInfo();
        }
    }
}
