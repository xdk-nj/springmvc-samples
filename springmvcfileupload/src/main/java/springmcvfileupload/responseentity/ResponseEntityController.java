package springmcvfileupload.responseentity;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResponseEntityController {
    @RequestMapping("resp")
    public ResponseEntity<String> test() {
        MultiValueMap<String, String> headers = new HttpHeaders();
        headers.add("Set-Cookie", "username = xdk");
        ResponseEntity<String> responseEntity = new ResponseEntity<>("Success!!", headers, HttpStatus.OK);
        return responseEntity;
    }
}
