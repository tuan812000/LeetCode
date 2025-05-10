#include <iostream>
using namespace std;
class Solution {
public:
    int lengthOfLastWord(string s) {
        if(s.length() == 0) return 0;
        string laststring="";
        if(s[0]!= ' ')  laststring += s[0];
        for(int i=1; i<s.length(); i++){
            if(s[i]!= ' ' && s[i-1] != ' ')   laststring += s[i];
            else if(s[i]!= ' ' && s[i-1] == ' ')   laststring = s[i];
        }
        return laststring.length();
    }
};