#include <iostream>
class Solution {
public:
    int reverse(int x) {
        long rs = 0;
        while (x){
            rs = rs*10+x%10;
            x/= 10;
        }
        if(rs>INT_MAX || rs<INT_MIN) return 0;
        return rs;
    }
};