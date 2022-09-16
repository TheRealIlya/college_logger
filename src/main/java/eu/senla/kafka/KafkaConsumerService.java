package eu.senla.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "request_logs", groupId = "first")
    public void consumeRequestLog(String requestLog) {
        System.out.println("REQ LOG: " + requestLog);
    }

    @KafkaListener(topics = "token_grant_logs", groupId = "first")
    public void consumeTokenGrantLog(String tokenGrantLog) {
        System.out.println("TKN LOG: " + tokenGrantLog);
    }

}
