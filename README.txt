L3N Java Project - Real Estate
==============================

Initial setup
-------------

IntelliJ IDEA

1.  Clone the repository
2.  Open the project in IntelliJ IDEA
3.  Open the Maven tab on the right
4.  Right-click on the project and select `Download Sources and Documentation`

Testing
-------

This project uses JUnit 5 for unit testing. You can run the tests by right-clicking on the `src/test/java` folder and selecting `Run all tests` or by running the `test` script in the Maven tab under "Lifecycle".
All the test are in the `src/test/java` folder.

Running the application
-----------------------

Within IntelliJ IDEA

To start the application, simply run the `Main` class in the `src/main/java` folder.

From the command line

DISCLAIMER: Running the jar in a Windows terminal (PS/CMD) will not work. You need to use a unix terminal (like git bash or WSL) or a unix system.
Running the app through IDEA will work regardless of the platform.

Start by building the jar with the `package` script in the Maven tab under "Lifecycle". Then, run the following command in the root of the project:

java -jar target/l3n-java-project-1.5.0.jar
