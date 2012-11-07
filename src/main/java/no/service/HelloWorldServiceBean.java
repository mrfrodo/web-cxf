package no.service;

import javax.jws.WebService;

@WebService(endpointInterface = "no.service.HelloWorldService")
public class HelloWorldServiceBean implements no.service.HelloWorldService {

    @Override
    public String sayHello(String s) {
        System.out.println("hello world web-cxf." +s);

        return "HELLO web-cxf "+s;
    }

}