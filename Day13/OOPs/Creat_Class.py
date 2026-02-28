class student:
    Name="Mrutyunjay"
    Age=20
    def info(self):
        print(f"{self.Name} age is {self.Age}")

a=student()
b=student()
# print(a.Name)
a.Name="Giri"
print(a.Name)
a.info()
b.info()


