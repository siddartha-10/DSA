/*
 This takes O(n^2) times because the loop has to run n times and also the each time an element is added
 the reference to the old string is dereferenced.
*/


public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i=0;i<26;i++){
            char ch = (char)('a'+i);
            series = series + ch;
        }
        System.out.println(series);
    }
}
