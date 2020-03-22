// 1. Two Sum (https://leetcode.com/problems/two-sum/)
//
// Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
// Example:
//
// Given nums = [2, 7, 11, 15], target = 9,
//
// Because nums[0] + nums[1] = 2 + 7 = 9,
// return [0, 1].

#include <iostream>
#include <vector>
#include <unordered_map>

using namespace std;

vector<int> twoSum(vector<int>& nums, int target) {
    vector<int> result;
    unordered_map<int, int> tmp;

    for (int i=0; i<nums.size(); i++) {
        tmp.insert(pair<int, int>(nums[i], i));
        unordered_map<int, int>::iterator it = tmp.find(target - nums[i]);
        if (it != tmp.end() && it->second != i) {
            result.push_back(it->second);
            result.push_back(i);
            return result;
        }
    }


    return result;
}

int main() {

    int target = 9;
    int arr[] = {2, 7, 11, 15};
    vector<int> v(arr, arr + sizeof(arr)/sizeof(int));

    vector<int> result = twoSum(v, target);
    for (vector<int>::iterator it = result.begin(); it != result.end(); it++) {
        cout << *it << " ";
    }
    cout << endl;

}


