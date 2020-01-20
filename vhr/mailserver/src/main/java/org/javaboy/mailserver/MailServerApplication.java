package org.javaboy.mailserver;

import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author Shadowalker
 */
@SpringBootApplication
public class MailServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MailServerApplication.class, args);
    }

    @Bean
    Queue queue() {
        return new Queue("javaboy.mail.welcome");
    }
}
