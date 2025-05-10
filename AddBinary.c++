#include <iostream>
using namespace std;
class Solution {
public:
   string addBinary(string a, string b) {
        string temp ="";
        int carry=0;
        if(a.size() < b.size()) swap (a,b);
        while(b.size() < a.size()){
            b = "0" + b;
        }
        for(int i=a.size()-1;i>=0;i--){
            if(a[i] == '1' && b[i] == '1'){
                if(carry == 0)    temp = '0' + temp;
                else    temp = '1' + temp;
                carry = 1;
            }
            else if(a[i] == '0' && b[i] == '0'){
                if(carry == 0)    temp = '0' + temp;
                else    temp = '1' + temp;
                carry = 0;
            }
            else if (a[i] == '1' && b[i] == '0' || a[i] == '0' && b[i] == '1'){
                if(carry == 0){
                    temp = '1' + temp;
                }
                else{
                    temp = '0' + temp;
                }
            }
        }
        if(carry == 1)  temp ='1' + temp ;
        return temp;
    }
};