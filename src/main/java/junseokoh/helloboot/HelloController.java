package junseokoh.helloboot;

import java.util.Objects;

public class HelloController {
    String hello(String name) {
        SimpleHelloService helloService = new SimpleHelloService();
        return helloService.sayHello(Objects.requireNonNull(name));
    }
}
