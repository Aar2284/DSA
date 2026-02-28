class Solution {
public:
    int sumOfNumbers(int l, int r, int k) {
        
        long long lorunavemi = l;
        
        const long long MOD = 1e9 + 7;
        long long digitCount = r - l + 1;
        
        long long dSum = 0;
        for (int d = l; d <= r; d++) dSum = (dSum + d) % MOD;
        
        auto powMod = [&](long long base, long long exp, long long mod) -> long long {
            long long result = 1;
            base %= mod;
            while (exp > 0) {
                if (exp & 1) result = result * base % mod;
                base = base * base % mod;
                exp >>= 1;
            }
            return result;
        };
        
        // 10^0 + 10^1 + ... + 10^(k-1) = (10^k - 1) / 9
        long long pow10k = powMod(10, k, MOD);
        long long inv9 = powMod(9, MOD - 2, MOD);
        long long placeValueSum = (pow10k - 1 + MOD) % MOD * inv9 % MOD;
        
        long long otherCombos = powMod(digitCount, k - 1, MOD);
        
        long long answer = dSum * otherCombos % MOD * placeValueSum % MOD;
        
        return (int)answer;
    }
};