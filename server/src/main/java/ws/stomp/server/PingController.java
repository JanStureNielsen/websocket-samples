package ws.stomp.server;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class PingController {
    @MessageMapping("/ping")
    @SendTo("/topic/ping")
    public long greeting(long ping) throws Exception {
        return ping;
    }

}
