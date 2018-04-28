package junit5.mockito;

import org.igorski.junit5.mockito.mockito.ChatEngine;
import org.igorski.junit5.mockito.mockito.MessageSender;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.igorski.junit5.mockito.mockito.StatusCode.OK;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.STRICT_STUBS)
class ChatEngineTest {

    @Mock
    private MessageSender messageSender;

    @Test
    public void shouldUseMessageSenderToSendMessage() {
        ChatEngine chatEngine = new ChatEngine(messageSender);
        String messageToSend = "Hello!";

        chatEngine.say(messageToSend);
        when(messageSender.send(messageToSend)).thenReturn(OK);

        assertThat(messageSender.send(messageToSend)).isEqualTo(OK);
    }

}