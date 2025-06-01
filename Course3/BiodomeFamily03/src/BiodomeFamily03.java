public class BiodomeFamily03 {
    public static void main(String[] args) {
        // LifeNest 객체 생성
        LifeNest nest = new LifeNest();

        // Organism 객체 생성
        Animal penguin = new Animal("펭귄", "남극", "육식", "물고기");
        Animal koala = new Animal("코알라", "호주", "초식", "유칼립투스");
        Plant cactus = new Plant("선인장", "사막", "11월", true);
        Plant peppermint = new Plant("페퍼민트", "정원", "7월", false);

        // Organism을 LifeNest에 추가, 출력
        nest.addOrganism(penguin);
        nest.addOrganism(koala);
        nest.addOrganism(cactus);
        nest.addOrganism(peppermint);
        nest.displayAllOrganisms();

        // 삭제
        nest.removeOrganism("코알라");
        nest.removeOrganism("선인장");
        nest.displayAllOrganisms();
    }
}
