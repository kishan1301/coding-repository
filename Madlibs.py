STORY = "This morning %s woke up feeling %s. 'It is going to be a %s day!' Outside, a bunch of %ss were protesting to keep %s in stores. They began to %s to the rhythm of the %s, which made all the %ss very %s. Concerned, %s texted %s, who flew %s to %s and dropped %s in a puddle of frozen %s. %s woke up in the year %s, in a world where %ss ruled the world."

print("The Mad Libs has started!!")

name = input("Enter your name: ")

print("\nWe will be needing 3 adjectives!")
adj1 = input("Enter first adjective: ")
adj2 = input("Enter second adjective: ")
adj3 = input("Enter third adjective: ")

print("\nNow, we have requirement for a verb!")
verb = input("Enter a verb: ")

print("\nNow, we will need 2 nouns!")
noun1 = input("Enter first noun: ")
noun2 = input("Enter the second noun: ")

print("Now, Enter the following: ")
animal = input("An animal: ")
food = input("A food: ")
fruit = input("A fruit: ")
superhero = input("A superhero: ")
country = input("A country: ")
dessert = input("A dessert: ")
year = input("A year: ")

print(STORY % (name, adj1, adj2, animal, food, verb, noun1, fruit, adj3, name, superhero, name, country, name, dessert, name, year, noun2))
