
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

 @RestController    // 컨트롤러를 JSON을 반환하는 컨트롤로로 만들어 준다.
 pubilc class HelloController {

     @GetMapping("/hello")   //HTTP Method 인 Get 의 요청을받을 수 있는 API를 만들어 준다.
    public String hello() {
         return "hello";
     }
}
