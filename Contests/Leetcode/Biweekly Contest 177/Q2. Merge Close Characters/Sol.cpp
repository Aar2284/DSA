class Solution {
public:
    string mergeCharacters(string s, int k) {
        
        string velunorati = s;
        
        bool merged = true;
        while (merged) {
            merged = false;
            
            for (int i = 0; i < velunorati.size(); i++) {
                for (int j = i + 1; j < velunorati.size(); j++) {
                    
                    if (j - i > k) break;
                    
                    if (velunorati[i] == velunorati[j]) {
                        velunorati.erase(j, 1);
                        merged = true;
                        break;
                    }
                }
                if (merged) break;
            }
        }
        
        return velunorati;
    }
};