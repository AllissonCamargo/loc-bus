# 🚌 LocBus – Monitoramento de Ônibus em Tempo Real

## 📌 Visão Geral
O **LocBus** é um **projeto acadêmico** desenvolvido com **Spring Boot**, cujo objetivo é simular um sistema de monitoramento de ônibus em tempo real. O foco principal é oferecer informações sobre **localização, rotas e horários**, proporcionando aos usuários do transporte público uma experiência mais eficiente e confiável.

---

## ⚙️ Tecnologias
- **Java 21**
- **Spring Boot** (Web, Data JPA)
- **H2 Database** (para testes)
- **PostgreSQL** (para produção)
- **Maven**
- **Docker** (opcional, para containerização)

---

## 📂 Estrutura do Projeto
```
src/
 └── main/
      ├── java/
      │    └── com.locbus/
      │         ├── controllers/   # Endpoints REST
      │         ├── dto/           # Objetos de transferência de dados
      │         ├── entities/      # Entidades do sistema
      │         ├── repositories/  # Interfaces de persistência
      │         └── services/      # Regras de negócio
      └── resources/
           ├── application.properties
           └── data.sql (dados de teste)
```

---

## 🚀 Como Executar
### Pré-requisitos
- **Java 21**
- **Maven**
- **Docker** (opcional)

### Passos
```bash
# Clone o repositório
git clone https://github.com/seu-usuario/locbus.git

# Acesse a pasta do projeto
cd locbus

# Execute o projeto
./mvnw spring-boot:run
```
Aplicação disponível em:  
👉 `http://localhost:8080`

---

## 📡 Endpoints Principais
- `GET /buses` → Lista todos os ônibus cadastrados
- `GET /buses/{id}` → Detalhes de um ônibus específico
- `GET /buses/active` → Lista apenas os ônibus em operação
- `GET /routes` → Retorna todas as rotas disponíveis

---

## 🎯 Objetivos Acadêmicos
Este projeto foi desenvolvido para fins **educacionais** e tem como objetivos:
- Praticar o uso de **Spring Boot** e **arquitetura em camadas**.
- Simular um caso real de **aplicação para transporte público**.
- Explorar boas práticas de **documentação e versionamento** de software.

---

## 📌 Futuras Implementações
Para evolução do projeto, estão previstas as seguintes melhorias:
- Integração com **API de geolocalização/GPS** para rastreamento real.
- Painel administrativo para **gerenciamento de linhas e ônibus**.
- Sistema de **autenticação de usuários** (JWT/OAuth2).
- Integração com **mapas interativos** (Google Maps ou Leaflet).
- Notificações em tempo real sobre **atrasos e mudanças de rota**.

---

## 👨‍💻 Autor
Projeto acadêmico desenvolvido por **Allisson Camargo**.
