class Solution {
public:
    vector<int> minDistinctFreqPair(vector<int>& nums) {
        
        map<int, int> freq;
        for (int n : nums) freq[n]++;
        
        vector<int> keys;
        for (auto& p : freq) keys.push_back(p.first);
        
        for (int i = 0; i < keys.size(); i++) {
            for (int j = i + 1; j < keys.size(); j++) {
                if (freq[keys[i]] != freq[keys[j]]) {
                    return {keys[i], keys[j]};
                }
            }
        }
        
        return {-1, -1};
    }
};