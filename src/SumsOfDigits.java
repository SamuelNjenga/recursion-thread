public class SumsOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(5678));
    }
    static int sum(int num){
        if(num <= 9){
            return num;
        } else{
            return num % 10 + sum(num / 10);
        }
    }
}
