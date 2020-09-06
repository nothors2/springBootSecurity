# Spring boot Security Study with JPA 

## 참조 유툽
Spring Boot + Spring Security with JPA authentication and MySQL from scratch - Java Brains

https://www.youtube.com/watch?v=TNt3GHuayXs&list=PLqq-6Pq4lTTYTEooakHchTGglSvkZAjnE&index=8

### Reference Documentation
For further reference, please consider the following sections:

### docker
##### test & cmd
- mvn package
- java -jar demo-0.0.1-SNAPSHOT.jar
- D:\project_study\spring\intelliJ\springDemo3>docker build -t demo .
- docker run -p8080:8080 demo
- http://localhost:8080/
- docker ps
- docker stop CONTAINER ID


- docker ps -a : 히스토리
- docker container start 428c42834c1a : 이전거 실행
- docker images : 로컬 이미지

- docker commit -a "springBootDemo" 428c42834c1a nothorse/spring-boot-demo 이미지 고정
  * & 사이트에서 저장소 생성(이름 nothorse/spring-boot-demo)
- docker push nothorse/spring-boot-demo:latest : tagname은 docker ps -a 에서 확인

***** mysql
- docker pull mysql:8.0.21
- docker run -d -p 3306:3306 -e MYSQL_ROOT_PASSWORD=password --name mysql8 -v /Users/jmlim/datadir:/var/lib/mysql mysql:8.0.21 --character-set-server=utf8mb4 --collation-server=utf8mb4_unicode_ci


#### 참조
https://www.youtube.com/watch?v=nCQE3ewl9ps






* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.3.3.RELEASE/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.3.3.RELEASE/maven-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.3.3.RELEASE/reference/htmlsingle/#using-boot-devtools)

