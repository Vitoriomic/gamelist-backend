# Imagem base com Java 21
FROM eclipse-temurin:21-jdk

# Define o diretório de trabalho
WORKDIR /app

# Copia todos os arquivos do projeto
COPY . .

# Concede permissão de execução ao Maven Wrapper
RUN chmod +x ./mvnw

# Compila o projeto sem executar os testes
RUN ./mvnw clean package -DskipTests

# Expõe a porta padrão do Spring Boot
EXPOSE 8080

# Comando para executar a aplicação
ENTRYPOINT ["java", "-jar", "target/dslist-0.0.1-SNAPSHOT.jar"]
