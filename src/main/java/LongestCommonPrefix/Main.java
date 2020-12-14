package LongestCommonPrefix;

public class Main {
    public String longestCommonPrefix(String[] strs){
        if (strs.length == 0){
            return "";
        }else{
            String pref = strs[0];
            for (int i = 1; i < strs.length; i++){
                while(strs[i].indexOf(pref) != 0){
                    pref = pref.substring(0, pref.length() - 1);
                    if (pref.equals("")){
                        return "";
                    }
                }
            }
            return pref;
        }

    }
}
