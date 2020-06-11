public class NumToOne {
    public static void main(String[] args) {
        printNumbers(-6);
    }
    public static void printNumbers(int num){
        if(num <= 0){
            return;
        }
        if(num ==1){
            System.out.println("One");
        }
        else {
            System.out.println(num);
            printNumbers(num - 1);
        }
    }
}
