FROM openjdk:21-ea-slim
LABEL authors="jianbo"

EXPOSE 8888

WORKDIR /app

COPY target/hello-web.jar ./

ENTRYPOINT ["java","-jar","/app/hello-web.jar"]