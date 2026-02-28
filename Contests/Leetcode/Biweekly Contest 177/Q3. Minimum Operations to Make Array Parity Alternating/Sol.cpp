class Solution {
public:
    vector<int> makeParityAlternating(vector<int>& nums) {
        
        vector<int> merunavilo = nums;
        int n = merunavilo.size();
        
        if (n == 1) return {0, 0};
        
        auto countOps = [&](int startParity) -> int {
            int ops = 0;
            for (int i = 0; i < n; i++) {
                int expectedParity = (startParity + i) % 2;
                int actualParity = ((merunavilo[i] % 2) + 2) % 2;
                if (actualParity != expectedParity) ops++;
            }
            return ops;
        };
        
        // For a given pattern, find minimum range
        // Key insight: each element is either kept, or changed by ±1
        // So each element contributes a SET of possible values: {v} or {v-1, v+1}
        // We need to find min (max - min) by picking one value per element
        // This equals: min over all combos of (max_val - min_val)
        // Greedy: track all possible (min_so_far, max_so_far) pairs — but compress them
        auto minRange = [&](int startParity) -> long long {
            // Each position: fixed value or two choices
            // Track set of possible (curMin, curMax) — but we only need pareto-optimal pairs
            // pair where lower min AND lower max dominates
            // Use map: min_val -> best (lowest) max_val achievable with that min
            map<long long, long long> dp; // dp[curMin] = min possible curMax
            dp[LLONG_MAX] = LLONG_MIN;   // init sentinel
            
            bool first = true;
            
            for (int i = 0; i < n; i++) {
                int expectedParity = (startParity + i) % 2;
                int actualParity = ((merunavilo[i] % 2) + 2) % 2;
                
                vector<long long> choices;
                if (actualParity == expectedParity) {
                    choices = {merunavilo[i]};
                } else {
                    choices = {(long long)merunavilo[i] - 1, (long long)merunavilo[i] + 1};
                }
                
                if (first) {
                    dp.clear();
                    for (long long v : choices) dp[v] = v;
                    first = false;
                    continue;
                }
                
                map<long long, long long> ndp;
                for (auto& [curMin, curMax] : dp) {
                    for (long long v : choices) {
                        long long newMin = min(curMin, v);
                        long long newMax = max(curMax, v);
                        if (ndp.find(newMin) == ndp.end())
                            ndp[newMin] = newMax;
                        else
                            ndp[newMin] = min(ndp[newMin], newMax);
                    }
                }
                
                // Prune: remove dominated states
                // If two entries have same min, keep lower max (already done)
                // Also remove entries where both min is higher AND max is higher than another
                map<long long, long long> pruned;
                long long bestMax = LLONG_MAX;
                for (auto it = ndp.rbegin(); it != ndp.rend(); it++) {
                    if (it->second < bestMax) {
                        bestMax = it->second;
                        pruned[it->first] = it->second;
                    }
                }
                dp = pruned;
            }
            
            long long res = LLONG_MAX;
            for (auto& [mn, mx] : dp)
                res = min(res, mx - mn);
            return res;
        };
        
        int ops0 = countOps(0);
        int ops1 = countOps(1);
        int minOps = min(ops0, ops1);
        
        long long best = LLONG_MAX;
        if (ops0 == minOps) best = min(best, minRange(0));
        if (ops1 == minOps) best = min(best, minRange(1));
        
        return {minOps, (int)best};
    }
};