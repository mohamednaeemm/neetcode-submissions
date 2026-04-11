class Solution:
    def countStudents(self, students: List[int], sandwiches: List[int]) -> int:
        num = len(students)
        movePo = 0
        if num < 1:
            return 0
        while num > 0 and num != movePo:
            if students[0] == sandwiches[0]:
                del sandwiches[0]
                del students[0]
                num -= 1
                movePo = 0
            else:
                moveEl = students.pop(0)
                students.append(moveEl)
                movePo += 1
        
        return movePo