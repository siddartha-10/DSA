// https://practice.geeksforgeeks.org/problems/element-appearing-once2552/0?company[]=Qualcomm&company[]=Qualcomm&difficulty[]=1&page=1&query=company[]Qualcommdifficulty[]1page1company[]Qualcomm&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=element-appearing-once
public class Find_the_element_that_appears_once {
    public static void main(String[] args) {
        int[] A = {1,3,2,3,2};
        int N = A.length;
        System.out.println(optimal_solution(A,N));
        //System.out.println(brute_force(A,N));
    }

    private static int brute_force(int[] a, int n) {
        int[] arr = new int[n];
        for (int i = 0; i < a.length; i++) {
            arr[a[i]]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1){
                return i;
            }
        }
        return -1;
    }

    private static int optimal_solution(int[] a, int n) {
        int mis_num = 0;
        for (int i = 0; i < n; i++) {
            mis_num = mis_num ^ a[i];
        }
        return mis_num;
    }
}
