import java.util.Scanner;

public class WindEnergy extends EnergySource {
    public WindEnergy() {
        super("풍력");
    }

    @Override
    public void produceEnergy() {
        Scanner sc = new Scanner(System.in);
        System.out.print("바람 속도를 입력하세요: ");
        int speed = sc.nextInt();
        int produced = speed * 5;
        addEnergy(produced);
        System.out.println(getSourceName() + " 에너지를 " + produced + " 생산했습니다.");
    }
}
