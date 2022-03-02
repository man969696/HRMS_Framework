set projectLocation=F:\B8-selenium\SEL Workplace\HRMS_framework
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml