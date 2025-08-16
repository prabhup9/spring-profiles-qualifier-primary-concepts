package guru.springframework.diexample.service;

import guru.springframework.diexample.repositories.Repo;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MessageServiceInjectionTest {

    @Test
    void email_and_sms_services_are_called_and_greeting_returned() {
        // Arrange
        Repo repo = Mockito.mock(Repo.class);
        when(repo.queryDatabase()).thenReturn("hello world");

        EmailService emailSpy = Mockito.spy(new EmailService());
        SmsService smsSpy = Mockito.spy(new SmsService());

        DiServiceImpl service = new DiServiceImpl(repo, emailSpy, smsSpy);

        // Act
        String greeting = service.getGreeting();

        // Assert
        assertEquals("hello world", greeting);
        verify(emailSpy, times(1)).sendMessage("hello world");
        verify(smsSpy, times(1)).sendMessage("hello world");
    }
}
