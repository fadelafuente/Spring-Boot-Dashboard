package tech.getArrays.employeemanager.monitor;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.HashMap;

@Endpoint(id="custom")
@Component
public class CustomActuatorEndpoint {

    @ReadOperation
    public Object customEndpoint(String username) {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        map.put("username", username);

        return map;
    }
}
