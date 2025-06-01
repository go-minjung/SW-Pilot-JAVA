// 동식물 객체 관리 클래스
import java.util.ArrayList;
import java.util.Iterator;

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
        Iterator<Organism> iterator = organismList.iterator();
        while (iterator.hasNext()) {
            Organism o = iterator.next();
            if (o.getName().equals(name)) {
                iterator.remove();
                System.out.println("[LifeNest] " + name + "이(가) 삭제되었습니다.");
                return;
            }
        }
    }

    // 모든 객체 출력
    public void displayAllOrganisms() {
        System.out.print("전체 동식물 목록 출력:\n");
        for (Organism organism : organismList) {
            organism.displayInfo();
        }
    }
}
