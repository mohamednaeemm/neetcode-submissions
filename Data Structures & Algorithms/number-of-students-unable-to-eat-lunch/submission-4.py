class Solution:
    def countStudents(self, students: List[int], sandwiches: List[int]) -> int:
        studentsCounts = [0, 0]
        for student in students:
            studentsCounts[student] += 1

        for sand in sandwiches:
            if studentsCounts[sand] > 0:
                studentsCounts[sand] -= 1
                students.pop()
            else:
                break

        return len(students)