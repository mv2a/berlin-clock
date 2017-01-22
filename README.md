#Set Theory Clock
https://en.wikipedia.org/wiki/Mengenlehreuhr in Java

Displays on the command line, in text the current time in the set theory clock, with ‘.’ representing an unlit light, R representing a lit red light, and Y representing a lit yellow light.

-----------------------------------------------------
####DESIGN:
BerlinUhrDateFormat was initially thought to be another implementation derived from the standard Java DateFormat class, such as SimpleDateFormat. But,
decided to keep it simple as per the requirements and not go beyond of what was asked, i.e it is not as sophisticated as standard Java SimpleDateFormat.

The principle I used to implement this was to simply start with an unlit section of hours and minutes. Both top rows fields for hours and minutes are driven by
increments of 5 time units each field. The bottom rows for hours and minutes are driven by the remainder of what goes over the largest multiple of 5, 
i.e 17 minutes would lit 3 fields (15) on the minutes top row and 2 fields on the bottom row.
Note that as per the clock specifications, the minutes section is special in a way that completed quarter-hours (mm % 15 == 0) are red lit.

Unit Tests were used to drive the implementation and their criteria were based on edge cases such as testing completed quarter-hours changes, individual rows of hours and minutes aswell as user input parsing. 

-----------------------------------------------------
#####CODE STYLE:

Slightly modified version of Checkstyle configuration that checks the Google coding conventions from Google Java Style
see src/main/resources/checkstyle.xml for more info.
-----------------------------------------------------
####REQUIREMENTS:
Java 8 (along with its platform requirements) and Maven 3

-----------------------------------------------------
####Compile, Run & Test:
Standard maven package as per the specs, it will run the tests as part of the build and produce an executable jar. 
Finally, run the jar with java -jar set-theory-clock-0.0.1-SNAPSHOT.jar for the available commands.

-----------------------------------------------------

**DISCLAIMER:**
This software is provided by Tiago Leao "as is" and "with all faults." The provider makes no representations or warranties of any kind concerning the safety, suitability, inaccuracies, typographical errors, or other harmful components of this Software product.
This project has been tested on MacOSX El Capitan, a Windows 7 x64 machine, a Ubuntu 16.04 x64 box and on a Raspberry Pi 3.0 server running with the latest Raspbian (through Jenkins).
I have used GIT to keep the history and progress of the development aswell as means to easily synchronise the code across my computers.