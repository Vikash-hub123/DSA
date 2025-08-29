class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> Map= new HashMap<Character,Integer>();
        Map.put('I',1);
        Map.put('V',5);
        Map.put('X',10);
        Map.put('L',50);
        Map.put('C',100);
        Map.put('D',500);
        Map.put('M',1000);
        int result = Map.get(s.charAt(s.length()-1));
        for(int i=s.length()-2; i>=0; i--){
            if(Map.get(s.charAt(i))< Map.get(s.charAt(i+1))){
                result= result-Map.get(s.charAt(i));
            }else{
                result= result+ Map.get(s.charAt(i));
            }
        }
        return result;
        
    }
}