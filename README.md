# Spring1-2020 recap observability

## Running Locally

- credentials require CloudWatch full accesses for now
 
```shell
$ docker-compose up -d
$ ./mvnw spring-boot:run -Dspring-boot.run.jvmArguments=" \
-Dcloud.aws.region.static=ap-northeast-1 \
-Dcloud.aws.credentials.instanceProfile=false \
-Dcloud.aws.credentials.accessKey=ABCDEFGHIJKLMNOPQRST \
-Dcloud.aws.credentials.secretKey=ABCDEFg123456789+abcdefghij12345ABCDEFGH"
```
