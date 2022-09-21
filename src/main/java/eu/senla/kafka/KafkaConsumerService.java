package eu.senla.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumerService {

    @KafkaListener(topics = "request_logs", groupId = "first")
    public void consumeRequestLog(String requestLog) {
        log.info(requestLog);
    }

    @KafkaListener(topics = "token_grant_logs", groupId = "first")
    public void consumeTokenGrantLog(String tokenGrantLog) {
        log.info(tokenGrantLog);
    }

}
