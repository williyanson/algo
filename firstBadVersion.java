/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) 
    {
        int left = 1;
        int right = n;
        int mid = -1;
        
        while(left<right)
        {
            mid = left +(right-left)/2;
            boolean flag = isBadVersion(mid);
            if(flag) right = mid;
            else left = mid+1;
        }
        
        return left;
        /*
        Instead of returning mid, u return left
        This is done because you will want one element right after the good one. 
        */
    }
}
