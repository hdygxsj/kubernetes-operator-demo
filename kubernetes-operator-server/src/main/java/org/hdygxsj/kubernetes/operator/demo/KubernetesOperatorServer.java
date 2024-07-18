package org.hdygxsj.kubernetes.operator.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class KubernetesOperatorServer {

    public static void main(String[] args) {
        new SpringApplicationBuilder(KubernetesOperatorServer.class).run(args);
    }
}
