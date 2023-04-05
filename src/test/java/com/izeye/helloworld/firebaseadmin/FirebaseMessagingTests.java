package com.izeye.helloworld.firebaseadmin;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingException;
import com.google.firebase.messaging.Message;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Tests for {@link FirebaseMessaging}.
 *
 * @author Johnny Lim
 */
@SpringBootTest
class FirebaseMessagingTests {

    @Autowired
    private FirebaseMessaging firebaseMessaging;

    @Test
    void send() throws FirebaseMessagingException {
        Message message = Message.builder().setTopic("test").putData("body", "Hello, Firebase!").build();
        String id = firebaseMessaging.send(message);
        System.out.println(id);
    }

}
