import random

# We can use a while loop until it is broken to keep using the magic eight ball:
while 1==1:
    # prompt for a question, of course the question will not matter and the loop will output a random answer using the random import

    question = input("Ask the magic 8 ball a question: (press enter to quit)\n")

    if not question: 

        break

    print(random.choice(("It is certain", "It is decidedly so.", "Without a doubt.", "Yes, Definatly!", "Yes.", "Your chances are looking good", "You may rely on it", "Ask again later", "Concentrate and ask again",  "Reply hazy, try again", "My reply is no", "My sources say no", "Absolutely Not!", "I don't think so...", "No.")),"\n")