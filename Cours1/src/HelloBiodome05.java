public class HelloBiodome05 {
    // 2개의 수식으로부터 g와 h값을 구해 마지막 수식의 값을 계산
    public static void main(String[] args) {
        for (int g=0; g<16; g++) {
            for (int h=0; h<16; h++) {
                if (caculateFirst(g, h) && caculateSecond(g, h)) {
                    int result = caculateFinal(g, h);
                    System.out.printf("g = %d, h = %d -> 결과: %d%n", g, h, result);
                }
            }
        }
    }

    static boolean caculateFirst(int g, int h) {
        int left = ((g&1)>>g)<<2;
        int right = (h+g)^h;
        int result = left | right;
        return result == 1;
    }

    static boolean caculateSecond(int g, int h) {
        int left = ((g % 2) << h) >> g;
        int right = 1&0^0;
        int result = left | right;
        return result == 2;
    }

    static int caculateFinal(int g, int h) {
        int result = (h*h+g)*(h<<h)+(g<<g);
        return result;
    }
}


