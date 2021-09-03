package EditDistance;

import java.util.Arrays;

public class EditDistanceMemo {

    public static int editDistance(String s1, String s2){
        int m = s1.length();
        int n = s2.length();
        int[][] storage = new int[m+1][n+1];
        for(int[] i : storage) {
            Arrays.fill(i, -1);
        }
        return editDistance(s1, s2, storage);
    }
    public static int editDistance(String s1, String s2,int[][] storage){
        int m = s1.length();
        int n = s2.length();
        if(s1.length()==0) {
            storage[m][n] = s2.length();
            return storage[m][n];
        }
        if(s2.length()==0) {
            storage[m][n] = s1.length();
            return storage[m][n];
        }
        if(storage[m][n]!=-1) {
            return storage[m][n];
        }
        if(s1.charAt(0)==s2.charAt(0)) {
            storage[m][n] = editDistance(s1.substring(1), s2.substring(1), storage);
            return storage[m][n];
        }

        storage[m][n] = 1 + Math.min(Math.min(editDistance(s1.substring(1), s2.substring(1), storage),
                                          editDistance(s1.substring(1), s2, storage)
                                         ), editDistance(s1, s2.substring(1), storage));
        return storage[m][n];


    }

}
