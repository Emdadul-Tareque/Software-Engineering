class WaterBottle:
    __color = "blue"
    height = " "
    weight = " "
    capacity = " "
    radius = " "
    logo = " "
    currentWater = " "

    def __init__(self, color):
        self.__color = color

# bottle1 = WaterBottle()
# print(bottle1.color

bottle1  = WaterBottle("red")
bottle1.color = 'white'
print(bottle1.color)
