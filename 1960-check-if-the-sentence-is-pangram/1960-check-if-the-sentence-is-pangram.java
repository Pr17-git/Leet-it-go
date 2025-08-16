class Solution {
    public boolean checkIfPangram(String sentence) {
        String h=sentence.toLowerCase().replaceAll("[^a-z]", "");
        boolean a = h.chars()
            .distinct()
            .filter(Character::isLetter)
            .count() == 26;
            if(a==true){
                return true;
            }
            return false;
    }
}