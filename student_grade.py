student_grade = []
no_of_students = int(input("How many students do you have? "))
no_of_subjects = int(input("How many subjects do they offer? "))

print("Saving >>>>>>>>>>>>>>>>")
print("Saved successfully!")
def summation_of_scores_per_subject(student, subject):
    #count = 0
    counter = 0
    for index in range(no_of_students):
        students = []
        print("Entering score for student " + str(index + 1))
        for count in range(no_of_subjects):
            scores = int(input("Enter score for subject " + str(count + 1) + " "))
            if scores > 0 and scores <= 100:
                print("Saving >>>>>>>>>>>>>>>>")
                print("Saved successfully!")
                students.append(scores)
            else:
                print("Please enter a valid score")
                count = count - 1
        student_grade.append(students)
    return student_grade


summation_of_scores_per_subject(no_of_students, no_of_subjects)

# def scores_total_and_average(grades):
#     total = 0
#     for index in grades:
#         total = index + index
#     print(total)

# scores_total_and_average(summation_of_scores_per_subject(no_of_students, no_of_subjects))
