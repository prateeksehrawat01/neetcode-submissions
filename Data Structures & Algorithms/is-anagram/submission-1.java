class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arrs = new int[26]; 
        int[] arrt = new int[26];
        if (s.length()!=t.length()){
            return false;
        }
        for (int i = 0; i < s.length(); i++){
            int a=((int) s.charAt(i))-97;
            arrs[a]+=1;
            int b=((int) t.charAt(i))-97;
            arrt[b]+=1;

        }
        return Arrays.equals(arrs,arrt);

    }
}
