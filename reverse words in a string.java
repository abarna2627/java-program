class Solution {
    public String reverseWords(String s) {
        String word="";
        String result="";
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) != ' '){
                word=s.charAt(i)+word;
            }
            else{
                if(word.length()>0){
                if(result.length()>0){
                    result=result+ " ";
                }
                
                result=result+word;
                word="";
            }
        }
        }
        if(word.length()>0){
            if(result.length()>0){
                result=result+" ";
            }

            result=result+word;
        }
return result;
    }


}