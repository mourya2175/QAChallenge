Requirement :
Create a simple REST API service with a single endpoint. The endpoint has a single parameter, an integer and returns a String according to the fizz buzz challenge (return “fizz” if input mod 3 == 0, “buzz” if input mod 5 == 0, but “fizz buzz” if both conditions are true.

Steps to develop end point: (Using Java language)
packages, classes in src/main/java
1.Created a spring maven project using required dependencies
2. Created an interface with method calculateFizzOrBuzz
3. Created moduloservice and implemented method calculateFizzOrBuzz
4. Created a class ModuloController and called method calculateFizzOrBuzz.
5. Created ApplicationInitializer which will start spring boot server
Here is the endpoint
http://localhost:8080/modulo?number=5  -- Number is parameter we can pass any number based on that it will give output according to logic

UnitTests:
created Junit tests under src/test/java
Created a Junit file ModuloServiceTest, created different @Test for each input that are test cases to test the modulo functionality

Execution:
1. We can execute Junit test cases by running ModuloServiceTest.java
2. Created a batch script ..with double click we can execute unit tests -- ExecuteUnitTests.bat
3. Created a Jenkinsfile with Jenkins pipeline that starts the service and the testing -- which is part of the project

Code :
Code is available in Github : 
https://github.com/mourya2175/QAChallenge.git

 
