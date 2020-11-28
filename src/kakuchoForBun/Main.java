package kakuchoForBun;

public class Main {

    public static void main(String[] args) {
        int plusTotal = 0;
        int minusTotal = 0;
        int number[] = { 1, 2, 3, 4, 5 };
        for (int score : number) {
            // 配列内で足し算するループ
            plusTotal += score;
            // 配列内で引き算するループ
            minusTotal -= score;
        }
        System.out.println("配列内を全部プラスすると" + plusTotal);
        System.out.println("配列内を全部マイナスすると" + minusTotal);

    }

}
