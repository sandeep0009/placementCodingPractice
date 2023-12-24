public class StringReverse {
    public static String reverse(String s){
        String[]words=s.split("\\s+");
        StringBuilder result= new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            result.append(words[i]).append(" ");

        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String s= "welcome to mettle";
        System.out.println(reverse(s));
    }
}
