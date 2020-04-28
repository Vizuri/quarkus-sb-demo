#mvn package -DskipTests -Pnative -Dquarkus.native.container-build=true
docker build -f src/main/docker/Dockerfile.native -t vizuri/quarkus-sb-demo:1.1 .
docker push vizuri/quarkus-sb-demo:1.1
