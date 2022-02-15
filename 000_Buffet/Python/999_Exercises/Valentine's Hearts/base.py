import datetime

with open('People.txt') as f:
    for line in f:
        l = line.strip()
        print(l)

with open('Compliment.txt') as f:
    for line in f:
        l = line.strip()
        print(l)


x = datetime.datetime.now()

print()
print("The date and time are:")
print(str(x.day) + "/" + str(x.month) + "/" + str(x.year) + " at " + str(x.hour))

f.close()
