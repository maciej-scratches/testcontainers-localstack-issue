package com.example;

import org.junit.jupiter.api.Test;
import org.testcontainers.containers.localstack.LocalStackContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

@Testcontainers
class LocalstackContainerTest {

    @Container
    public static LocalStackContainer localstack = new LocalStackContainer(DockerImageName.parse("localstack/localstack:0.11.3")).withServices(
            LocalStackContainer.Service.S3);

    @Test
    void foo() {
        System.out.println(localstack.getEndpointOverride(LocalStackContainer.Service.SQS));
    }
}