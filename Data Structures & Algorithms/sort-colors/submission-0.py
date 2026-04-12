class Solution:
    def sortColors(self, nums: List[int]) -> None:
        counts = [0, 0, 0]

        for i in nums:
            counts[i] += 1

        i = 0

        for j in range(len(counts)):
            for k in range(counts[j]):
                nums[i] = j
                i += 1
        