#
# makefile 
#
# input file for 'make' build tool ( /usr/bin/make )
# to build solution for CS 5666 JUnit sample
#
# @author Dr. Fenwick
# @version Spring 2017
#

JUNIT_JAR = /usr/share/java/junit-4.10.jar
HAMCREST_JAR = /usr/share/java/hamcrest/core-1.1.jar

default: 
	@echo "usage: make target"
	@echo "available targets: compile, test, clean"

compile: HelloWorld.java TestHelloWorld.java
	javac -cp .:$(JUNIT_JAR) TestHelloWorld.java
	javac HelloWorld.java

clean:
	rm -f HelloWorld.class
	rm -f TestHelloWorld.class

test: HelloWorld.class TestHelloWorld.class 
	java -cp .:$(JUNIT_JAR):$(HAMCREST_JAR) org.junit.runner.JUnitCore TestHelloWorld



