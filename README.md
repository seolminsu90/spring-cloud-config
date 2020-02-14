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

### Git 상 config file이 변경되었을 경우
```bash
CURL -XPOST configclient:8080/actuator/refresh
```
