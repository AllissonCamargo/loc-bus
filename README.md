# 🚌 LocBus – Monitoramento de Ônibus em Tempo Real

## 📌 Visão Geral
O **LocBus** é um **projeto acadêmico** desenvolvido com **Spring Boot**, cujo objetivo é consumir uma **API externa de localização de ônibus** e fornecer informações organizadas aos usuários do transporte público. O projeto permite acessar dados em tempo real, filtrando e processando informações para que o usuário tenha uma experiência mais eficiente e confiável.

---

## ⚙️ Tecnologias
- **Java 21**
- **Spring Boot** (Web, Data JPA)
- **Maven**
- **Docker** (opcional, para containerização)

> Observação: Banco de dados não é necessário, pois os dados são consumidos diretamente da API externa, mas pode ser usado para testes ou armazenamento temporário.

---

## 📂 Estrutura do Projeto
```
com.locbus
 ├── controllers/      # Endpoints REST que o frontend vai consumir
 ├── services/         # Lógica para consumir e processar a API externa
 ├── dto/              # Objetos de transferência de dados para o frontend
 └── config/           # Configurações da aplicação (ex: URL da API externa)
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
- `GET /buses` → lista todos os ônibus retornados da API externa
- `GET /buses/active` → somente ônibus em operação
- `GET /routes` → rotas disponíveis (se fornecidas pela API)

---

## 🎯 Objetivos Acadêmicos e Técnicos
Este projeto tem como objetivo:
- Desenvolver um backend funcional em **Spring Boot**, aplicando boas práticas de arquitetura em camadas (Controller → Service → DTOs).
- Consumir dados de uma **API externa** e processá-los para uso próprio, mantendo controle total do projeto.
- Simular um caso real de **monitoramento de transporte público**, permitindo fácil expansão futura.

---

## 📌 Futuras Implementações
- Integração com **API de geolocalização/GPS** para rastreamento em tempo real.
- Painel administrativo para **gerenciamento de rotas** e monitoramento.
- Sistema de **autenticação de usuários** (JWT/OAuth2).
- Integração com **mapas interativos** (Google Maps ou Leaflet).
- Notificações sobre **atrasos e mudanças de rota**.

---

## 👨‍💻 Autor
Projeto acadêmico desenvolvido por **Allisson Camargo**.
