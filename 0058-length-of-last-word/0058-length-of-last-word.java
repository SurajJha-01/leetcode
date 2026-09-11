class Solution {
    public int lengthOfLastWord(String s) {
        //words find
        String words[] = s.split(" ");
        return words [words.length-1].length();
    }
}