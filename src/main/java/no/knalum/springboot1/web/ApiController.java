package no.knalum.springboot1.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class ApiController {
    @GetMapping("/api/hello")
    public ResponseEntity<?> hello() {
        HashMap<String, String> map = new HashMap<>();
        map.put("field1", "Hello from java backend! " + System.currentTimeMillis());
        return ResponseEntity.ok(map);
    }

}
