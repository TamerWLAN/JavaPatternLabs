Laboratory Work #1
Adapter:
Declare an interface with two methods – the first outputs the surname, first name and patronymic, the second outputs
the date of birth. Declare a second interface with a method that outputs initials and ages in one
line. Adapt one interface to another.

Laboratory Work #2
Template method:
Create a working structure that accepts a list of file names from the command line. It
opens every file except the last one for reading and the last one for writing. This working
the structure processes each incoming file using an undefined policy, and then writes
the result to the last file. Inherit from this working structure to create two different
applications:
• The first one converts all the letters of each file to uppercase.
• The second searches for files that contain words from the first file.

Laboratory work #3
Command (Command):
Implement a Tic-Tac-Toe game with the ability to cancel multiple moves.

Laboratory Work #4
Strategy:
Text is entered from the keyboard (or from a file). Encrypt it with one of three methods (methods
encryption can be selected arbitrarily), use popular libraries for encryption.
Encrypt with normal algorithms like RSA, AES, Blowfish. No "Caesars",
"Vizhiners" and other pseudo-cryptographic nonsense.

Laboratory Work #5
Abstract factory:
So there is an aggregator of insurance companies (option 1) or banks (option 2), each of
the insurance banks (to provide for three) has a similar (equivalent) list of products. For insurance
companies, this is CASCO, CTP, Property insurance and so on, for banks it can be credit cards.
Your task is to study several insurance | banks, compare credit /insurance products, and
create a factory that allows you to create different products for your aggregator in a single way.

Laboratory Work #6
Chain of responsibilities:
You pass the file name as an argument to the program, the program / script, depending on
the extension, will have to call the appropriate handler class, which will tell (by typing in
the terminal) which installed applications can open this file. And if the application
found, call the command to open the file. To search for an application, use the unix utility
whereis, a list of valid applications should be prescribed for each handler,
it is recommended to use the subprocess module (Python), or ProcessBuilder (Java) to run the application.
