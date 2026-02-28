class student:
    def __init__(self):
        print("Mrutyunjay")


a=student()


class Teacher:
    def __init__(self,Name,id):
        self.name=Name
        self.id=id

    def info(self):
        print(f"{self.name} and id {self.id}")


a=Teacher("Kushi",101)
a.info()
b=Teacher("Ruja",102)
b.info()
      

       