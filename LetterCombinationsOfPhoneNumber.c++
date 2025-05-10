#include <iostream>
#include <String>
#include <vector>
using namespace std;
class Solution {
private:
    void solve(int index, string digits, vector<string> &ans,string output, vector<string> mapping){
    if(index >= digits.length()){
        ans.push_back(output);
        return;
    }
    int num = digits[index] - '0';
    string tmp = mapping[num];
    for(int i=0; i<tmp.length();i++){
        output.push_back(tmp[i]);
        solve(index+1,digits,ans,output,mapping);
        output.pop_back();
    }
}
public:
    vector<string> letterCombinations(string digits) {
        vector<string> mapping = {" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        int index = 0;
        string output;
        vector<string> result;
        if(digits.length() == 0)   return result;
        solve(index,digits,result,output,mapping);
        return result;
    }
};