class Solution {
    public int myAtoi(String s) {
        String answer = "";
        String alphaRegex = ".*[Aa-zZ].*";
        
        for(int i = 0 ; i < s.length() ; i++){
            String character = "" + s.charAt(i);
            if(character.matches(alphaRegex)) break ;
            if(character.equals("+") || character.equals("-") || character.equals(" ")){
                if(answer.length() > 0){
                    break;
                }
            }
            if(!character.equals(" ")){
                answer = answer + character;
            }
        }
        if(answer.length() == 1){
             if(answer.equals("+") || answer.equals("-")){
                return 0;
            }
        }
       
       if(answer.length() > 0){
            double answ = Double.parseDouble(answer);
            if (Math.pow( -2 , 31) > answ){
                return((int) Math.pow( -2 , 31));
            }
            else if(Math.pow( 2 , 31) - 1 < answ ){
                return ((int) Math.pow( 2 , 31));
            } 
            else{
                return (int) answ;
            }
        }
        return 0;
    }
}
