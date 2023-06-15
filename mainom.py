class Square:
    def __init__(self,x):
        self.x = x*x
    def area(self):
        print("Area of sqare is: ",self.x)
    

class Rectangel(Square):
    def __init__(self,x,y):
        self.x= x
        self.y = y
        super().__init__(x)

    def area(self):
        print(self.x * self.y)

ob = Rectangel(2,4)
ob.area();