# A Short Exercise to Explore Object-Oriented Programming - Encapsulation

---
## Overview

This repository is a short exercise designed for you to explore **Encapsulation** which is one of the
four pillars of Object-Oriented Programming (OOP).

---
## 📖 Instructions

- Fork this repository
  

- To run the program, go to the [Main](src/main/java/com/techreturners/encapsulation/bankaccount/app/Main.java) class which 
  is the entry point and run it using IntelliJ
  

- There are two models `DodgyBankAccount` and `SecureBankAccount`, these are located in the 
  [model](src/main/java/com/techreturners/encapsulation/bankaccount/model) directory.

---
## 🤓 Study Prompts

Use the following questions to guide your exploration and learning! 🗺

**1)** Run the `main` method on the `Main` class, what is it doing? What is being outputted to the console?

**Answer:** The program is making transactions in two bank accounts, one that is unsecure and another one that is secure, it is displaying the actions taking place on each account and the way it is trying to hack them, click [here](output/InitialMainOutput.txt) to see it. 



**2)** Look at the `DodgyBankAccount`, this class is not well-encapsulated.
  Can you note down the problems with how the class is designed, and the ways it is being misused?

**Answer:** There are several issues in the doggy account:
- The *addReward* method is public, so it can be misused.
- The account number and account balance are public.
- The reward amount is also public.
- The user is taking advantage by calling the addReward method several times and by setting directly the account balance. 


**3)** Compare and contrast the `DodgyBankAccount` and the `SecureBankAccount`, how is the `SecureBankAccount` different to 
the `DodgyBankAccount`? How is it designed to prevent it from being misused? Are there instances of better method names
  for clearer abstraction?
  
**Answer:** The Secure Bank account is designed secure because:
- It doesn't allow the addReward method to be called directly (it is private).
- It hides the properties Account number, Reward amount and Account balance from the public.
- It sets a better name for displaying the account balance, something that makes clearer how that property is used.
  
---
## 🐸 Extension Challenge

- Now that you've had the chance to explore a well-encapsulated vs. poorly-encapsulated class,
your next challenge is to put your newly minted skills into practice 💪!
  
- Refactor the `WeatherReporter` class located in the [model](src/main/java/com/techreturners/encapsulation/bankaccount/model) directory.
  
- You may want to think about Encapsulation here. Do the methods follow the Single Responsibility Principle (SRP)? Are the method names suitable?
  Are there any magic numbers / hardcoded numbers in the code that needs to be represented by a constant?
  Are there better ways to write the code?
  
- As an added challenge, could you write some unit tests to test the class' methods?
