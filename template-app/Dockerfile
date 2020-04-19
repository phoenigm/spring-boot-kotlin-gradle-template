FROM adoptopenjdk/openjdk11:alpine-jre

COPY ./build/libs/template-app.jar template-app.jar
CMD ["java", "-Xmx128m", "-jar", "template-app.jar"]
