package com.bhawna.Exercise1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DummyLogger implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {
        log.info("Hello from Task1");
    }
}
