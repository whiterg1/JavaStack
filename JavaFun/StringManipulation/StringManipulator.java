public class StringManipulator{

// Trim and Concat method
    public String trimAndConcat(String str1, String str2){
        String newStr = str1.trim() + str2.trim();
        
        return newStr;
    }
    public Integer getIndexOrNull(String str3, char letter){
        Integer newInt = str3.indexOf(letter);
        if(newInt < 0){
            return null;
        }else{
            return newInt;
        }
    }
    public Integer getIndexOrNull(String str4, String str5){
        Integer newInt = str4.indexOf(str5);
        if(newInt < 0){
            return null;
        }else{
            return newInt;
        } 
    }
    public String concatSubstring(String str6, Integer int1, Integer int2, String str7){
        String newStr = str6.substring(int1, int2) + str7;
        return newStr;
    }
}