class Solution {
    public boolean isAnagram(String s, String t) {

if (s.length() != t.length())
        {
            return false;
        }

        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();
        java.util.Arrays.sort(sSort);
        java.util.Arrays.sort(tSort);

        if(java.util.Arrays.equals(sSort, tSort)){
            return true;
        }
        else
        {
            return false;
        }

     }

}
