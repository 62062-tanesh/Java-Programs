package Problem110;

public class TestingFuntionalInterface {
    public static void main(String[] args) {
        Candidate c1 = num -> {
            for(int i = 2; i< num/2; i++){
                if(num % i == 0){
                    return false;
                }
            }
            return true;
        };

        System.out.println(c1.isCandidate(19));
    }
}
