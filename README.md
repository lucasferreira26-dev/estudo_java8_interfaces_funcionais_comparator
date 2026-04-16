# 📦 Java 8 - Interfaces Funcionais (Comparator + Lambda)

Este projeto foi desenvolvido com o objetivo de praticar os conceitos iniciais de **Interfaces Funcionais** em Java 8, com foco no uso da interface `Comparator` em conjunto com **expressões lambda**.

---

## 🚀 Objetivo

Explorar:

- O conceito de **interface funcional**
- Uso de **lambda expressions**
- Ordenação de coleções com `Comparator`
- Reutilização de lógica com métodos

---

## 🧠 Conceitos aplicados

- Interface funcional (`Comparator`)
- Expressões lambda `(param1, param2) -> resultado`
- Ordenação com `Collections.sort()`
- Método `Double.compare()`
- Método `compareTo()` para Strings

---

## 📂 Estrutura do Projeto
- ├── Main.java
- └── Pedido.java


---

## 📌 Funcionalidades

### ✅ 1. Ordenação por valor (crescente)
Ordena os pedidos do menor para o maior valor.

---

### 🔽 2. Ordenação por valor (decrescente)
Ordena os pedidos do maior para o menor valor.

---

### 🔤 3. Ordenação por nome do cliente
Ordena os pedidos em ordem alfabética com base no nome do cliente.

---

### ♻️ 4. Método reutilizável
Criação de um método genérico que recebe:
- Uma lista de pedidos
- Um critério de ordenação (`Comparator`)

---

## 💻 Exemplo de uso

```java
Comparator<Pedido> ordenarPorValor = 
    (p1, p2) -> Double.compare(p1.getValor(), p2.getValor());

ordenarPedido(copiaPedidos, ordenarPorValor);
```

## 📈 Aprendizados

Este projeto reforça como o Java 8 trouxe melhorias significativas na escrita de código, tornando-o:

- Mais conciso
- Mais legível
- Mais flexível
