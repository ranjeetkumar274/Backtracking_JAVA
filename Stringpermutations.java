import java.util.List;

import java.util.ArrayList;
public class Stringpermutations {
    static void printp(String str, String t,List<String> list){
        if(str.equals("")){
            list.add(t);
            return;
        }

        for(int i = 0; i  < str.length(); i++){
            char ch = str.charAt(i);
            String left = str.substring(0,i);
            String right = str.substring(i+1);
            String rem = left+right;
            printp(rem,t+ch,list);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        List<String> list = new ArrayList<>();
        printp(str,"",list);

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
