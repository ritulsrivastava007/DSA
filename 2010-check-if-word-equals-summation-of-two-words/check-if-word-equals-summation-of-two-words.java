class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {    
        int s1=0,s2=0,s3=0;
        for (char ch:firstWord.toCharArray()){
            s1=s1*10+(ch-'a');
        }
        for (char ch:secondWord.toCharArray()){
            s2=s2*10+(ch-'a');
        }
        for (char ch:targetWord.toCharArray()){
            s3=s3*10+(ch-'a');
        }
        return s1+s2 == s3;
    }
}