FROM gradle:jdk17-alpine
COPY . /app
WORKDIR /app
EXPOSE 8080
CMD ["gradle", "bootrun"]
