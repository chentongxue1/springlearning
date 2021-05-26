package SEU.SuZhou.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//处理器
@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello(){
        return "hello spring";
    }

}
