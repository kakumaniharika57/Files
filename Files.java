import java.util.*;

public class Files {
    public static void main(String args[]) {
        HashMap<String, String> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("file1");
        arr1.add("file2");
        arr1.add("file3");
        arr1.add("file4");
        arr1.add("file5");
        arr1.add("file6");
        String str1 = "file1";
        String str2 = "\tfile2";
        String str3 = "\tfile3";
        String str4 = "\t\tfile4";
        String str5 = "\tfile5";
        String str6 = "file6";

        int spaces1 = (str1.length() - str1.trim().length());
        arr.add(spaces1);
        int spaces2 = str2.length() - str2.trim().length();
        arr.add(spaces2);
        int spaces3 = str3.length() - str2.trim().length();
        arr.add(spaces3);
        int spaces4 = str4.length() - str2.trim().length();
        arr.add(spaces4);
        int spaces5 = str5.length() - str2.trim().length();
        arr.add(spaces5);
        int spaces6 = str6.length() - str2.trim().length();
        arr.add(spaces6);
        // System.out.println(arr);
        for (int i = 0; i < 6; i++) {
            if (arr.get(i) == 0)
                map.put(arr1.get(i) + "-----", "null");
            else if (arr.get(i) == 1)
                map.put(arr1.get(i) + "-----", str1);
            else if (arr.get(i) == 2)
                map.put(arr1.get(i) + "-----", str3.trim());
        }
        for (Map.Entry<String, String> ele : map.entrySet()) {
            System.out.println(ele);
        }
    }
}