import java.util.HashMap;
    class Solution {
        // Finds decimal value of a given roman numeral
        public static int romanToDecimal(String str) {
            // code here
              HashMap<Character,Integer>map = new HashMap<>();
           map.put('M',1000);
           map.put('D', 500);
           map.put('C',100);
           map.put('L',50);
           map.put('X',10);
           map.put('V',5);
           map.put('I',1);
           int result = 0;
           for(int i =0;i=<str.length() - 1;i++){
               if(map.get(str.charAt(i)) >= map.get(str.charAt(i+1))){
                   result = result + map.get(str.charAt(i));
               }
               else{
                   result = result - map.get(str.charAt(i));
               }
           }
           result = result + map.get(str.charAt(str.length()-1));
           System.out.println(result);
           return result;
        }
    
    public static void main(String[] args){
        romanToDecimal("CDXLIII");

    }
}
    

