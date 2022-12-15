class Grades:
    
    def __init__(self,name,grade):
        
        self.name = name
        self.grade = grade
        
    def get_grade(self):
        
        if self.grade >= 90:
            
            return "A"
            
        elif self.grade >= 80:
            
            return "B"
            
        elif self.grade >= 70:
            
            return "C"
            
        elif self.grade >= 60:
            return "D"
        
        else:
            
            return "E"
            
name = input("Enter Name: ")

grade = float(input("Enter Grades: "))

student = Grades(name, grade)

print(f"{student.name} has a grade of {student.get_grade()}.")