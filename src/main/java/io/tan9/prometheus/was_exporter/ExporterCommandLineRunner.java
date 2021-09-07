package io.tan9.prometheus.was_exporter;

import io.prometheus.jmx.WebServer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ExporterCommandLineRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        WebServer.main(args);
    }

}
