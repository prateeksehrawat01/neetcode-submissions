class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupedWords = new ArrayList<>();
         
        int[] arr=new int[strs.length];
        for (int i=0;i<strs.length;i++){
            List<String> word=new ArrayList<>();
            if(arr[i]!=1){
                word.add(strs[i]);
                for(int j=i+1;j<strs.length;j++){
                    if (isAnagram(strs[i],strs[j])){
                        arr[j]=1;
                        word.add(strs[j]);

                    }
                }
                groupedWords.add(word);
            
            }

        }
        return groupedWords;
        
    }
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
