@echo off
rem This file configures the settings necessary to compile the lab project on this machine.
rem However, this file needs to be changed in a couple of places.
rem You need to replace all instances of <your NMC ID> with your NMC ID, otherwise
rem this batch file will not run and you will not be able to compile the test project.
set ANT_HOME=C:\Users\<your NMC ID>\Desktop\Java-calculator\JavaCalculator\apache-ant-1.10.1-bin\apache-ant-1.10.1
set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_151
set PATH=%PATH%;%ANT_HOME%\bin  