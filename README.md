# CS471 Spring Security

### Weerawong Vonggatunyu 6410406860

Lab Assignment: [Web Development with Spring MVC & Thymeleaf](https://docs.google.com/document/d/1I4bzRFoL_7WrvNlvY5LoZKC-r6Zc919vEUvLZ1q2xNc/edit)

## MySQL Setup

Run with docker

```sh
docker run --name=mysql_kafe -e MYSQL_ROOT_PASSWORD=abc123 -e MYSQL_DATABASE=kafe -p 3307:3306 -d mysql
```

See data inside database

```sh
$ docker exec -it mysql_kafe bash
/# mysql -u root -p
mysql> show databases;
mysql> use kafe;
mysql> show tables;
mysql> select * from member;
mysql> exit
/# exit
```

## Start Development Server

```sh
mvn spring-boot:run
```
