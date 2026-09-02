class Solution:
    def maxi(self, arr: List[int],i: int ,j: int):
        maxi=0
        for k in range(i,j):
            if maxi< arr[k]:
                maxi=arr[k]
        return maxi


    def replaceElements(self, arr: List[int]) -> List[int]:
        for i in range(0,len(arr)):
            arr[i]=self.maxi(arr,i+1,len(arr))
        arr[len(arr)-1]=-1

        return arr

        