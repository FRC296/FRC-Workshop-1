# Basic Java Review
In this workshop, we'll quickly go over Java basics, write some code, and then push it to the FRC 296 repository.
## What is a programming language?
* A programming language is what **allows us to talk to computers**
* When we write and run a program, a computer will "read" our program and do what we ask it to
	* We write programs to perform tasks like controlling a robot, calculating things, , etc.
## What makes Java different from other languages?
* There are many languages you might've heard of, like Python, C, etc.
* Many differences, but the biggest ones are in syntax and purpose
	* **Syntax**
		* Syntax for a programming language is like spelling in english
		* When writing a program, we have to "spell" our words correctly so the computer can properly understand
	* **Purpose**
		* Different languages are written for different reasons
			* HTML is written to render web-pages, MATLAB for engineering analysis, etc.
			* **Java** is an *object-oriented* language, like Python or C++
				* Java is used for a wide variety of purposes
				* E.g. Robots, Android Apps, and even **MINECRAFT** 

## The Building Blocks of Java
The most important building blocks of a program are *variables,* *operators*, *classes*, and *functions*.
### Variables
* A variable (like in math) is used to represent a piece of data
	* Just as an equation uses a variable *x* to symbolize a number, a program **uses a variable to symbolize a block of the computer's memory**
	* We declare a variable by writing its **type**, its **name**, and assigning its **value**. E.g.
		 ```java
				int myInteger = 5;
		```
		* Here, a variable of type **integer** (int) named *myInteger* is declared and **set equal to 5**
		 ```java
				String myString = "Hello World!";
		```
		* Here, a variable of type **String** named *myString* is declared and **set equal to "Hello World"**

	* So **what does the computer do** with this?
		* The computer takes the values we assign, and stores them in the memory
		* Once in the memory, we can use these values to calculate things and much more
	* **Most Common Variable Types:**
		```java
		int
		float
		double
		String
		```
----
### Operators
* An **operator** (again, like in math) is used to modify a stored value
	* E.g. consider two **integers** stored in memory, that we want to add. We would first declare the integers, and then use the **+ operator** to perform addition
		 ```java
				int x = 5;
				int y = 10;
				int sum = 0;
				sum = x + y;
		```
		* The addition of x and y is stored in the variable *sum*
	* Java has many operators. The most important ones we will explore are:
		* Addition &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;**+**
		* Subtraction  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; **-**
		* Multiplication &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; **\***
		* Division &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; **/**
		* Assignment  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; **=**
		* Function Call &nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; **.**
----
### Classes
* A Java class is a sort of *container* for your code
	* When a class is declared in java, memory is **allocated** for this class and whatever may be inside it
* **Everything in Java is a class!** Literally everything
	* This isn't really the norm though; Most languages offer classes but don't require them
* E.g. consider your classic "Hello World" program
	```java
		class HelloWorld 
		{
		    public static void main(String[] args) 
		    {
		        System.out.println("Hello World!");
		    }
		}
	```
	* Here you can see that the *main* function of the program is contained within a class, called *HelloWorld*
		* This file would be saved as ```HelloWorld.java```
----

### Functions
* Functions are **called** to perform some sort of routine
	* This routine could be adding two numbers, printing a statement, whatever you'd like!
* We create functions so that we don't have to rewrite code
* Functions consist of three main parts:
	* A return type, arguments, and a body
		* The **return type** tells us what type of variable the function will give us (maybe an integer or a string)
		* The **arguments** are what we can *pass* to a function (maybe we pass it one integer, maybe two)
		* The **body** defines what we do with the arguments, and what we return
* E.g. take a look at the following two functions
	```java
		int add(int x, int y)
		{
			int sum = x + y;
			return sum;
		}
	```
	* Here the **return type** is integer, the **arguments** are the two integers *x* and *y*, and the **body** of the function adds the two arguments. 		
</br>
</br>
* A function could also not return anything. In that case, we say the return type is ```void```

	```java
		void print()
		{
			System.out.println("Hello World!");
		}
	```
	* Note that this function has no return type, nor does it take any arguments! It just prints *Hello World!* to the terminal.
* Finally, to *invoke* or *call* these functions, we would do the following
	```java
		int sum = add(5,10);	// here we assign the return value to the variable sum
		print();		// here we invoke a void function with no arguments
	```

## Conditional Statement and Iterators
* Conditional statment and iterators are tools we use in Java and other languages to control the flow of a program
### Conditional Statement
* A **conditional statement** checks is a conditions is met, and acts based on if it is met or not
	* The condition could be comparing two values, checking if two values are equal, etc.
* The ```if``` statement
	* An *if statement* allows a program to enter a **body** of code if the condition presented is met
	* E.g. suppose we have the following situation
	```java
		int x = 5;
		int y = 10; 
		
		if(x > y)
		{
			// do stuff
		}
		if(x < y)
		{
			// do more stuff
		}
		if(x == y)
		{
			// do even MORE stuff
		}
	```
	* Which of these would execute?

* Conditions we could use include
	* Greater Than&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  **>**
	* Less Than&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **<**
	* Greater Than or Equal to&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **>=**
	* Less Than or Equal to&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **<=**
	* Equal&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;**==**
	* Not Equal&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;**!=**
	-----
### Iterators
* An **iterator** makes a body of code loop until a *condition* is met. There are two types:
* The  ```for``` loop
	* A *for loop* makes a body of code execute as many times as we want it to
		* We could make a body of code loop as little as 1 time or as many as 10000000 times
	*  E.g., if we wanted to make a loop that runs 100 times and adds 1 to a variable, we could do
	```java
		int x = 0;
		for(int i = 0; i<100; i++)
		{
			x = x+1;
		}
	```
	* What does the stuff in the parenthesis mean? 
		* ```int i = 0;``` declares a new variable *i*
		* ```i<100``` means "Keep looping while ```i``` is less than 100"
		* ```i++``` means add 1 to *i* after *every loop*
</br>
</br>
* The ```while``` loop
	* A *while loop* loops forever until a condition is met
		* It's kind of like a for loop, except instead of stopping when a number is reached, the while loop stops when a *condition is reached*.
	* E.g. if we wanted a while loop to run 100 times and add 1 to a variable, we could say
	```java
		int x = 0;
		while(x < 100)
		{
			x = x+1;
		}
	```
	
	
## Putting all of This Together
* Now I will present a little coding challenge
* Using this [Java Playground](https://code.labstack.com/java), write a Java code that will have:
</br>

	1. A function that takes voltage and current and **returns the total amount of power**.
		* Takes two integers (or floats): Voltage and Current
		* Returns one integer (or float): Power
	</br>
	</br>
	2. A function that takes a first name and last name and **returns the full name in capital letters as a single string**.
	</br>
	</br>
	3. A function that prints your name *diagonally* using a **for loop**
		* E.g.
	```java
		A
			D
				R
					I
						A
							N	
	```
	* **HINTS AND TOOLS**
		* **Power Equation**
			* P = IV (Power = Current * Voltage)
		* **String Concatenation**
			* Like numbers, strings can *also be added together*
				* We call this concatenation
		* 
		* ```System.out.print("Your text here");``` is used to print a statement to the terminal in Java
		* You can use **special characters** ```\n``` and ```\t``` to format printed statements
			* ```\n``` prints a line (called the **newline** character)
			* ```\t``` prints a tab (called the **tab** character)
			* E.g. 
	```java
		System.out.print("Statement without any special characters");
		System.out.print("\n\nStatement with two newlines before and after\n\n");
		System.out.println("\n\tStatement with a newline and tab before it");
	```
		Output:
	```java
		Statement without any special characters
		
		Statement with two newlines before and after

			
			Statement with a newline and tab before it
	```			  
* Finally, you have to save this file to your desktop by doing the following:
		* Open **Notepad**
		* **Copy and paste** code into notepad
		* File > Save As > Code.java

# Pushing to GitHub
* Now we will use **terminal** and **git commands** to push your work to the FRC 296 WorkShop 1 Repository 
## What is GitHub?
* GitHub is a form of **version control**. Version control is used we have multiple people working on the same programming project, and we want to make sure the work done is synchronized. 
	* Think of GitHub as the Google Docs for coding
## Why Learn GitHub?
* GitHub is an amazing tool for any sort of programmer, for the following reasons:

	1. We can **collaborate** on programming projects **efficiently**
	2. Knowing how to navigate GitHub is useful for **finding resources** to help with projects. For example, check out the following open-source FRC repos
		* [FRC Team 254](https://github.com/Team254)
		* [FRC Team 2470](https://github.com/Team2470)
		* [WPI Library](https://github.com/wpilibsuite/allwpilib)
		 These could prove to be *really useful* for a future robot!
	3. Finally, GitHub is simply the *name of the game* these days. GitHub is used far and wide by from open source projects to companies

## Dependencies
* There are a few things your computer needs first
	1. You must have **GitBash** downloaded.
		* [GitBash Download](https://git-scm.com/downloads)
	2. The username and password for the GitHub account
		* Username: **296RoboticsStudent**
		* Password: **Robostudent296**

## Terminal Commands
In this section, we'll go over the most basic and **essential terminal commands** needed for Git. Knowing these commands are very useful in general
### What is a terminal?
* A  terminal (AKA *console* or *command line*) is a way of communicating with the computer. Communication through the terminal is done using **commands**, which are usually short abbreviations for actions you want to do
	* A terminal is a computer without its Graphical User Interface (GUI)
	* Some computers don't even have GUIs, and only have a terminal! 
		* E.g. RaspberryPis

### Who would want to use a computer without a GUI? 
* It sounds a bit silly right? Using a dull-looking terminal over a pretty graphical interface
	* We use terminals because they allow us to **directly manipulate and talk to the Operating System** (like Windows or Mac).
	* Commands in the terminal can be very powerful for controlling a computer
		* Think of commands as the tools we use to **navigate** the terminal

### The Commands
1. **Change directory**
	>	```cd```
	* This command allows us to change our **working directory**, or the directory our terminal is set to
	* Takes in a **path** as an argument.
		* I.e. the path we want to set our working directory to
	* Examples:
		* ```cd Documents```
		* ```cd Desktop/FRC/RobotsAreLit```
	* ```cd ~``` will take you back to your home directory
</br>
</br>
2. **List**
	> ```ls```
	* This command simply **lists the files** in our working directory
	* Example:
		* Input: 
			* ```ls```
		* Output:
			*  ```'Folder 1'  'Folder 2'  'Documents'  'Desktop'```
</br>
</br>
3. **Make Directory**
	>```mkdir <directory>```
	* This command will make a new directory of the name passed
	* Example:
		```mkdir frcWorkshop```
		```ls```
		```'frcWorkshop'```

## Git Commands
This section will cover the needed Git commands we need to push your work to the FRC296 repository.

### What is a GitHub Repository?
* A repository is just a name for a place where we store our code for a project, product, etc.
	* E.g. our repository for *Workshop 1* is where all of the workshop material is hosted
### What is a Git Command?
* Git commands are similar to terminal commands, but they are used for controlling GitHub from the terminal
#### The Commands
1. Initialize a repository
	>```git init```
	* This command **initializes a repository** in your working directory
	* E.g. if you *changed directory* into ```Documents``` and then initialized a repository, you'd see the following:
	```Initialized empty Git repository in C:/Users/patte/Documents/.git/```
</br>
</br>
2. Add a remote origin
	>```git remote add origin <repository link>```
	* This command tells git **where** our **remote repository is**
		* In other words, what's the link to the GitHub repository?
	* Git needs to know this in order to add files to the repository hosted online
	* E.g. to **add workshop 1** as the remote origin for our **empty initialized repository,** we'd say:
	>```git remote add origin https://github.com/FRC296/FRC-Workshop-1.git```
</br>
</br>
3. Add changes in working directory
	>```git add .```
	* This command adds **all** the files in our working directory to the *staging area*
		* In other words, we're just telling git what files we want to add to our remote project
	* If you only want to add one file at a time, you'd say ```git add file.txt```
</br>
</br>
4. Commit your changes
	>```git commit```
	* This command **saves** or commits our added files to our local working directory
	* To add a message with your commit, you can say
	```	git commit -m "This is my commit message!"```
		* and you will see it added on GitHub
</br>
</br>
5. Pushing our changes
	>```git push origin master```
	* Here we are **pushing** or "sending" the work in our local directory to its remote origin, the *master* branch
	* That's it!

#### Recap
1. We initialize a new repository
	>```git init```
2. We give Git the link for where the remote repository is
	>```git remote add origin <repository link>```
3. We add the files we wish to push to the remote repository
	>```git add .```
	* In this case we're adding all
4. We save our work using a commit
	>```git commit```
5. And finally, we send our work to the remote repository
	>```git push origin master```   

## The Final Push
1. Change into the directory where your java file is saved using ```cd``` and ```ls``` to navigate the terminal
2. Initialize an empty repository using ```git init```
3. Add your files by calling ```git add .```
4. Commit your changes with a message of your choice using ```git commit -m "message"```
5. Push your changes to the master branch using ```git push origin master```
