package no.conduct.service;

import javax.jws.WebService;

@WebService(endpointInterface = "no.conduct.service.HelloWorldService")
public class HelloWorldServiceBean implements HelloWorldService {

    @Override
    public String sayHello(String s) {
        System.out.println("hello world web-cxf." +s);

        return "HELLO web-cxf "+s;
    }

}