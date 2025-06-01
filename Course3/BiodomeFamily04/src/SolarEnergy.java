import java.util.Scanner;

public class SolarEnergy extends EnergySource {
    public SolarEnergy() {
        super("태양광");
    }

    @Override
    public void produceEnergy() {
        Scanner sc = new Scanner(System.in);
        System.out.print("일조 시간을 입력하세요: ");
        int hours = sc.nextInt();
        int produced = hours * 10;
        addEnergy(produced);
        System.out.println(getSourceName() + " 에너지를 " + produced + " 생산했습니다.");
    }
}
