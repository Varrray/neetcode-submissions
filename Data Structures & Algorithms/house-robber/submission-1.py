class Solution:
    def rob(self, nums: List[int]) -> int:
        n=len(nums)
        cache=[-1]*n
        def solve(i):
            if i>=n:
                return 0
            if cache[i]!=-1:
                return cache[i]

            inc=nums[i]+solve(i+2)
            exc=0+solve(i+1)
            cache[i]=max(inc,exc)
            return cache[i]
        return solve(0)


        
        