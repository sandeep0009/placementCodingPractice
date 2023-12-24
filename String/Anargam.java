public class Anargam {

    public static boolean checkAnargam(String s,String m){
        if(s.length()!=m.length())return false;
      
        int[]cha=new int[27];
        for(int i=0;i<s.length();i++){
            cha[s.charAt(i)-'a']--;
            cha[m.charAt(i)-'a']++;
        }

        for(int i=0;i<cha.length;i++){
            if(cha[i]==0)return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s="listen";
        String m="silen";
        System.out.println(checkAnargam(s, m));
    }
    
}
