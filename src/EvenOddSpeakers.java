public class EvenOddSpeakers {
    public static void main(String[] args) {
        System.out.println(mobileSpeakers(5));
    }
    static int mobileSpeakers(int mobiles){
        if(mobiles == 0){
            return 0;
        } else {
            if(mobiles % 2 == 0){
                return 2 + mobileSpeakers(mobiles - 1);
            }else{
                return 1 + mobileSpeakers(mobiles - 1);
            }
        }
    }
}
