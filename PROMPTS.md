what are active profiles in Spring boot? Explain the use cases for Active profiles. Provide examples for using databases, and other deployments. explain how profile specific properties are set


In the package 'guru.springframework.diexample.database', examine the class 'DiDataStore. Based on this class create a new class called "SpanishDiData" which returns "hello World" in spanish. Annotate the new class with the profile of "spanish". Update the class 'DiDataStore' with the profile not equal to "spanish"



Your goal is to implement an example of using Spring's @Primary and @Qualifier annotations to manage dependency injection ambiguity. Complete the following tasks:

In the package guru.springframework.diexample.service to the following:

Add a new interface called MessageService. The interface will have one method sendMessage accepting a String property called message.
Create an implementation of MessageService called EmailService, the sendMessage method will output to the console "Sending email: " + message value. Mark this class as the primary component, with the bean name of "emailService".
Create an implementation of MessageService called SmsService, the sendMessage method will output to the console "Sending SMS: " + message value. Mark this class as a component, with the bean name of "smsService".
In the implementation DiServiceImpl add two private final properties for MessageService called emailService and smsService. Update the constructor and use qualifiers to properly inject the beans. When the getGreeting method is called, use the emailService bean to send the message to email, and use the smsService to send the message to sms.
Create a new test to test the services are called. Use Mockito a mockito mock for the Repo dependency. Use mockito spies to verify the email and sms services are called.