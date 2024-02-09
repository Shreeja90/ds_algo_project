# ds_algo_project
Ds Algo project with cucumber BDD framework with junit test runner and allure reports using log4j for the logger.Step definition

The build tool we have used for the project is Maven , We have implemented POM and used Singleton design pattern of java to make sure that only one instance of the class is created and it has global access through out the framework. 

The folder structure consists of various packages as mentioned below:

1.Cucumber package: We created a Test Context Class in which we declared the objects for Webdriver Manager class and Page Object Manager class  and when we want to call the objects of Webdriver manager class and Page object manager class we directly called the Object of Test Context Class which  also represents the singleton design pattern.
2.Data Providers package: In this we have Config File reader class , Excel File reader class and Json Data reader class used to read data from configuration properties, excel sheet for login and json file for login.
3.Enums package: We created Enums in which we have defined constants called Driver type and Environment Type.
4.Managers package: We have File reader Manager class , Web driver Manager class and Page Object Manager class. To manage the web driver manager instance 
5.Pages package: We have created single class file for each page in which we were writing locators for web elemnts using Page Factory. 
6.Step Definition package: In this we have created Step definition for the corressponding Feature files. We are calling the functions from page class here.
7.Test Data package: In this we have stored mock test data in excel file , json.
8.Test Runner package: We were using Junit to execute our automation. In the test runner we have added plugins for allure reports.
