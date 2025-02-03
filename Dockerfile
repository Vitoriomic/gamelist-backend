# Use uma imagem compatível com Java 21
FROM eclipse-temurin:21-jdk

# Define o diretório de trabalho
WORKDIR /app

# Copia todos os arquivos para dentro do container
COPY . .

# Compila o projeto e ignora testes
RUN ./mvnw clean package -DskipTests

# Expõe a porta padrão do Spring Boot
EXPOSE 8080

# Executa a aplicação
ENTRYPOINT ["java", "-jar", "target/dslist-0.0.1-SNAPSHOT.jar"]
