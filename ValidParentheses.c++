#include <iostream>
#include <stack>
using namespace std;
class Solution {
public:
    bool isValid(string s) {
        if(s.size()<= 1)    return false;
        stack<char> ans;
        for(int i=0; i < s.length(); i++){
            if(s[i] == '{' || s[i] == '(' || s[i] == '['){
                ans.push(s[i]);
            }
            else{
                if(ans.empty() == false){
                    if( ans.top() == '{' && s[i] == '}' ||
                        ans.top() == '(' && s[i] == ')' ||
                        ans.top() == '[' && s[i] == ']' )
                        ans.pop();
                    else    return false;
                }
                else return false;
            }
        }
        if(ans.empty()) return true;
        else
            return false;
    }
};