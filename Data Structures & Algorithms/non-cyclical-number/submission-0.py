class Solution:
    def isnoncylinder(self,n:int )-> int :
        sum=0
        while n>0:
            sum=sum+(n%10)**2
            n=n//10
        return sum
    def isHappy(self, n: int) -> bool:
        ans=[]
        while n!=1 and n not in ans:
            ans.append(n)
            n=self.isnoncylinder(n)
        return n==1
        


        