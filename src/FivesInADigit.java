public class FivesInADigit {
    public static void main(String[] args) {
        System.out.println(count5(452531537));
    }

    static int count5(int num) {
        if (num <= 9) {
            if (num == 5) {
                return 1;
            } else {
                return 0;
            }
        } else {
            if (num % 10 == 5) {
                return 1 + count5(num / 10);
            } else {
                return 0 + count5(num / 10);
            }
        }
    }
}



