import random
def randomWord():
    random_words = ["apple", "banana", "sky", "laptop", "bottle", "river", "mountain", "guitar", "book", "window"]
    return random.choice(random_words)

word = randomWord()
l = len(word)