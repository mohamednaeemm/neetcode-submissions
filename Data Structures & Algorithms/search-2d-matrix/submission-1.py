class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        lM = 0
        rM = len(matrix) - 1
        l = 0
        r = len(matrix[0]) - 1

        while lM <= rM:
            midM = (lM + rM) // 2
            if matrix[midM][0] > target:
                rM = midM - 1
            elif matrix[midM][-1] < target:
                lM = midM + 1
            else:
                while l <= r:
                    mid = (l + r) // 2
                    if matrix[midM][mid] < target:
                        l = mid + 1
                    elif matrix[midM][mid] > target:
                        r = mid - 1
                    else:
                        return True
                return False
        return False


        