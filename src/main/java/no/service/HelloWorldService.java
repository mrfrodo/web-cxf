package no.service;

import javax.jws.WebService;

@WebService
public interface HelloWorldService {

    public String sayHello(String s);
}