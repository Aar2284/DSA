#import<climits>
#import<vector>

class Solution {
  public:
    int getSecondLargest(vector<int> &arr) {
        
        if(arr.size()<2)
        {
            return -1;
        }
        
        int first = INT_MIN;
        int second= INT_MIN;
        
        for(int i=0; i<arr.size();i++)
        {
            int currentvalue = arr[i];
            
            if (currentvalue>first)
            {
                second = first;
                first = currentvalue;
                
            }
            
            else if(currentvalue<first && currentvalue>second)
            {
                second = currentvalue;
            }
        }
        
        if(second == INT_MIN)
        {
            return -1;
        }
        
        return second;
    }
};