# spring-cloud-config
spring-cloud-config-test

## spring cloud sample - server
```bash
CURL -XGET configserver:8888/configclient/dev
CURL -XGET configserver:8888/configclient/prod

>>
{"name":"configclient","profiles":["dev"],"label":null,"version":"c7371257af7d44e8ef179ec39b3554f8610e908f","state":null,"propertySources":[{"name":"https://github.com/seolminsu90/spring-cloud-config.git/configclient-dev.yml","source":{"application.message":"Message From {ENV} Local Git Repository"}}]}
```

## spring cloud sample - client
```bash
CURL -XGET configclient:8080/message

>>
{"message":"Message From {ENV} Local Git Repository"}
```

- Git 상 config file이 변경되었을 경우
```bash
CURL -XPOST configclient:8080/actuator/refresh
```
- 이미 주입된 값을 변경하기 위해서는 @RefreshScope 사용

-------------------------------------------------------------------

# spring-cloud-eureka

## spring cloud eureka (server:8889)

- spring cloud config server(8888)에서 config 주입받은 유레카 서버

## spring cloud eureka client (client:8070)

- eureka client tester

## spring cloud eureka client1,2 (client:8060,8050)

- eureka client tester -> cleint1,2 loadbalence test
