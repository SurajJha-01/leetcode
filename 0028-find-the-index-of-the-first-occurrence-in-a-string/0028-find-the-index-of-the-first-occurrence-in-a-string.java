class Solution {
    public int strStr(String haystack, String needle) {
    if (needle.length() > haystack.length()){
        return -1;
    }

// apluplplump
//plum
    int n = haystack.length(),
    m = needle.length();
    // m
    // 0..m-1
    //1..m-1+1
    //2..m-1+2
    //k..n-1
    //n-1 = m - 1 + k
    // k = n-m
    
    // apluplplump

    // plum
    //     j
    // n = 11
    // m = 4
    for(int i = 0; i <= n - m; i++){
        int j = 0;

        while (j < m) {
            if (haystack.charAt( i + j ) != needle.charAt(j)){
               break;
            }
            j++;
        }
        if (j == m){
            return i;
        }
    }
        return -1;
    }
}