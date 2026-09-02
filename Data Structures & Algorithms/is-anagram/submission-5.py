class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        a=[0]*26
        if len(s)!=len(t):
            return False
        for i in range(len(s)):
            a[ord(s[i])-ord('a')]+=1
            a[ord(t[i])-ord('a')]-=1
        for i in a:
            if i!=0:
                return False
        return True

        