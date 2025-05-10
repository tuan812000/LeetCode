#include <iostream>
#include <vector>
using namespace std;
class Solution {
private:
    std::vector<int> gen_vector(std::vector<int> vt){
        if(vt.size() < 2)   return {};
        std::vector<int> result(vt.size()+1, 1);
        for(int i=1; i<result.size()-1;i++){
            result[i] = vt[i-1]+vt[i];
        }
        return result;
    }
public:
    vector<vector<int>> generate(int numRows) {
        if(numRows == 1)    return {{1}};
        std::vector<std::vector<int>> result;
        for(int i=0; i<numRows; i++){
            if(i < 2){
                std::vector<int>tmp(i+1,1);
                result.push_back(tmp);
            }
            else{
                result.push_back(gen_vector(result[i-1]));
            }
        }
        return result;
    }
};