# Build
mvn clean package && docker build -t br.com.cyborg.logback/logback .

# RUN

docker rm -f logback || true && docker run -d -p 8080:8080 -p 4848:4848 --name logback br.com.cyborg.logback/logback 