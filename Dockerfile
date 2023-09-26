ARG APP_JAR=trip-planner-backend-1.0.0.jar
FROM gradle:7-jdk21 AS build
COPY . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build

FROM openjdk:21
ARG APP_JAR
ENV APP_JAR_ENV=$APP_JAR
EXPOSE 8081
RUN mkdir /app
COPY --from=build /home/gradle/src/build/libs/${APP_JAR_ENV} /app/${APP_JAR_ENV}
ENTRYPOINT java -jar /app/${APP_JAR_ENV}