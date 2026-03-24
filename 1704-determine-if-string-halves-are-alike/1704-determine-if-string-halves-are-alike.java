class Solution {
    public boolean halvesAreAlike(String s) {
        int mid = s.length()/2;
        String a = s.substring(0,mid);
        String b = s.substring(mid);
        int count1 = 0;
        int count2 = 0;
        for(int i = 0;i<a.length();i++){
            char ch = Character.toLowerCase(a.charAt(i));
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count1++;
            }
        }
        for(int i = 0;i<b.length();i++){
            char ch = Character.toLowerCase(b.charAt(i));
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count2++;
            }
        }
        if(count1 == count2){
            return true;
        }
        return false;
    }
}