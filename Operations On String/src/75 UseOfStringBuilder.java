class UseOfStringBuilder {
    public static void main(String[] args) {
        String[] arr = {"Tanesh","is","a","Good","Student."};
        StringBuilder sb = new StringBuilder();
        for(String str:arr){
            sb.append(str).append(" ");
        }
        System.out.println(sb);
    }
}
