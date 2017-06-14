public class Solution {
    /*
    The code below will map the following letter-index
    A - 0
    B - 1
    ...
    Z - 25
    */
    public String convertToTitle(int n) 
    {
        StringBuilder sb = new StringBuilder();
        
        while(n>0)
        {
            n--;
            char letter = (char)('A'+n%26); // n%26 - will map to index
            sb.insert(0, letter);
            n /= 26; // Iterate to previous index
        }
        
        return sb.toString();
    }
}
