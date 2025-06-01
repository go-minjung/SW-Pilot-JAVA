// 마법사와 여러 유물 객체를 사용하여,유물의 능력을 활용하는 객체 지향적 프로그램
public class BiodomeFamily05 {
    public static void main(String[] args) {
        Sorcerer sorcerer = new Sorcerer("아리엘");

        SolarStone solarStone = new SolarStone();
        WindAmulet windAmulet = new WindAmulet();
        WaterMirror waterMirror = new WaterMirror();

        sorcerer.addArtifact(solarStone);
        sorcerer.addArtifact(windAmulet);
        sorcerer.addArtifact(waterMirror);

        sorcerer.showArtifactAbilities();
    }
}