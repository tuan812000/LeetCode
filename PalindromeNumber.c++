#include <iostream>
class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0 || x!=0 && x%10 ==0 ) return false;
        unsigned int check=0,tempX;
        tempX = x;
        while(tempX!=0){
            check = check*10 + tempX%10;
            tempX/=10;
        }
        return(check == x) ;
    }
};