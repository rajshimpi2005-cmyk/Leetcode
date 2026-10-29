class Solution {
public String mergeAlternately(String word1, String word2) {
StringBuilder result = new StringBuilder();
    int A = word1.length();
    int B = word2.length();
    int i = 0;
    int j = 0;

    while (i < A || j < B) {
        if (i < word1.length()) {
            result.append(word1.charAt(i));
            i++;
        }

        if (j < word2.length()) {
            result.append(word2.charAt(j));
            j++;
        }
    }

    return result.toString();
}


}
