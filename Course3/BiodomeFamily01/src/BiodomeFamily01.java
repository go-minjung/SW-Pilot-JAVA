public class BiodomeFamily01 {
    public static void main(String[] args) {
        // LifeNest 객체 생성
        LifeNest nest = new LifeNest();

        // Organism 객체 생성
        Organism penguin = new Organism("펭귄", "동물", "남극");
        Organism koala = new Organism("코알라", "동물", "호주");
        Organism cactus = new Organism("선인장", "식물", "사막");
        Organism peppermint = new Organism("페퍼민트", "식물", "정원");

        // todtjdehls Organism을 LifeNest에 추가, 출력
        nest.addOrganism(penguin);
        nest.addOrganism(koala);
        nest.addOrganism(cactus);
        nest.addOrganism(peppermint);
        nest.displayAllOrganisms();

        // 삭제
        nest.removeOrganism("코알라");
        nest.removeOrganism("페퍼민트");
        // 서식지 변경
        penguin.setHabitat("수족관");
        // 출력
        nest.displayAllOrganisms();
    }
}
