class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        count = len(nums)
        result = [0] * (count * 2)
        for i in range(count):
            result[i] = nums[i]
            result[count + i] = nums[i]

        return result
        