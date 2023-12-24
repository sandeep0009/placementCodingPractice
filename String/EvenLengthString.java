public class EvenLengthString {
    public static String checkEven(String s){
        String[]words=s.split("\\s+");
        StringBuilder result= new StringBuilder();
        for(int i=0;i<words.length;i++){
            if(words[i].length()%2==0){
                result.append(words[i]).append(" ");

            }
        }
        return result.toString();

    }
    public static void main(String[] args) {
        String s= "hell worl deep";
        System.out.println(checkEven(s));
    }
    
}
