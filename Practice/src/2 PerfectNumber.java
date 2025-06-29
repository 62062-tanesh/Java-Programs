

// Not Working.

class PerfectNumber {
    public static void main(String[] args) {
        int n = 100;
        int fact = 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    fact = fact+j;
                }
            }
            if(fact == i){
                System.out.println(i);
            }
        }
        System.out.println(fact);
    }
}
