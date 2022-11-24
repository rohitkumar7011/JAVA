import java.util.ArrayList;
public class Subsequence {
    static ArrayList<String> subseq(String str){
        if(str.length()== 0){
            ArrayList<String> empArrayList = new ArrayList<>();
            empArrayList.add(" ");
            return empArrayList;
        }
        // str = ravi
        char currentchar = str.charAt(0);
        // current chaar = 'r'
        String remString = str.substring(1);
        // current chaar = "avi"
        ArrayList<String> temp = subseq(remString);
        ArrayList<String> result = new ArrayList<>();
        for(String s : temp){
            result.add(s);
            result.add(currentchar + s);
        }
        return result;
    }

public static void main(String[] args) {
    String str = "rohit";
    ArrayList<String> si = subseq(str);
    System.out.println(si);
}}

