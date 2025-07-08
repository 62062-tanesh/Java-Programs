class DiceRoll {
    public int roll(){
        int n = (int)(Math.random()*6);
        return n;
    }

    public static void main(String[] args) {
        DiceRoll rollIt = new DiceRoll();
        for(int i=0;i<10;i++){
            System.out.println(rollIt.roll());
        }
    }
}
