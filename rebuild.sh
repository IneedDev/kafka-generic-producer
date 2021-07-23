#!/bin/bash

APP_NAME="kafka-generic-producer"
JAR="$APP_NAME.jar"
echo "Rebuilding $JAR" &&
mvn clean package
echo "Copying archive to docker directory" &&
mkdir -p docker/temp
cp target/$JAR docker/temp &&

echo "Rebuilding docker image"
cd docker &&
docker build --rm -t $APP_NAME:"latest" . &&
rm -fr temp &&
rm -fr temp &&
echo "Running docker" &&
docker run -it -p 8080:8080 $APP_NAME:"latest"

