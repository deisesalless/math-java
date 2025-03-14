# Classe `Math` em Java

A classe `Math` em Java faz parte do pacote `java.lang` e fornece métodos estáticos para realizar operações matemáticas comuns, como exponenciação, logaritmos, raízes quadradas, funções trigonométricas, entre outras. Como todos os métodos são estáticos, não é necessário criar uma instância da classe `Math` para utilizá-los.

## Principais Métodos da Classe `Math`

Abaixo estão alguns dos métodos mais utilizados da classe `Math`:

### 1. **Métodos Básicos**
- **`abs(double a)`**: Retorna o valor absoluto de um número.
  ```java
  double valorAbsoluto = Math.abs(-10.5); // 10.5
  ```
- **`max(double a, double b)`**: Retorna o maior valor entre dois números.
  ```java
  double maiorValor = Math.max(10, 20); // 20
  ```
- **`min(double a, double b)`**: Retorna o menor valor entre dois números.
  ```java
  double menorValor = Math.min(10, 20); // 10
  ```

### 2. **Exponenciação e Raízes**
- **`pow(double a, double b)`**: Retorna o valor de `a` elevado à potência de `b`
  ```java
  double potencia = Math.pow(2, 3); // 8.0
  ```
- **`sqrt(double a)`**: Retorna a raiz quadrada de `a`.
  ```java
  double raizQuadrada = Math.sqrt(16); // 4.0
  ```
- **`cbrt(double a)`**: Retorna a raiz cúbica de `a`.
  ```java
  double raizCubica = Math.cbrt(27); // 3.0
  ```

### 3. **Funções Trigonométricas**
- **`sin(double a)`**: Retorna o seno de um ângulo em radianos.
  ```java
  double seno = Math.sin(Math.PI / 2); // 1.0
  ```
- **`cos(double a)`**: Retorna o cosseno de um ângulo em radianos.
  ```java
  double cosseno = Math.cos(Math.PI); // -1.0
  ```
- **`tan(double a)`**: Retorna a tangente de um ângulo em radianos.
  ```java
  double tangente = Math.tan(Math.PI / 4); // 1.0
  ```
- **`toRadians(double anguloGraus)`**: Converte um ângulo de graus para radianos.
  ```java
  double radianos = Math.toRadians(180); // 3.141592653589793
  ```
- **`toDegrees(double anguloRadianos)`**: Converte um ângulo de radianos para graus.
  ```java
  double graus = Math.toDegrees(Math.PI); // 180.0
  ```

### 4. **Arredondamento**
- **`ceil(double a)`**: Retorna o menor valor inteiro maior ou igual ao número.
  ```java
  double teto = Math.ceil(4.3); // 5.0
  ```
- **`floor(double a)`**: Retorna o maior valor inteiro menor ou igual ao número.
  ```java
  double piso = Math.floor(4.7); // 4.0
  ```
- **`round(double a)`**: Retorna o valor arredondado para o inteiro mais próximo.
  ```java
  long arredondado = Math.round(4.5); // 5
  ```

### 5. **Logaritmos e Exponenciais**
- **`log(double a)`**: Retorna o logaritmo natural (base `e`) de `a`.
  ```java
  double logNatural = Math.log(Math.E); // 1.0
  ```
- **`log10(double a)`**:Retorna o logaritmo na base 10 de `a`.
  ```java
  double logBase10 = Math.log10(100); // 2.0
  ```
- **`exp(double a)`**: Retorna o valor de `e` elevado à potência de `a`.
  ```java
  double exponencial = Math.exp(1); // 2.718281828459045
  ```

### 6. **Números Aleatórios**
- **`random()`**: Retorna um valor `double` pseudoaleatório entre 0.0 (inclusive) e 1.0 (exclusive).
  ```java
  double aleatorio = Math.random(); // Exemplo: 0.123456789
  ```
- **`random()`**: Retorna um valor inteiro entre 0 e 9
  ```java
  int numero = (int) (Math.random() * 10);
  System.out.println(numero); // Pode ser 0, 1, 2, ..., 9
  ```

### 7. **Constantes Úteis**
- **`Math.PI`**:  Representa o valor de π (pi).
  ```java
  double pi = Math.PI; // 3.141592653589793
  ```
- **`Math.E`**:  Representa o valor da constante de Euler (e).
  ```java
  double euler = Math.E; // 2.718281828459045
  ```

## Conclusão
A classe `Math` é uma ferramenta poderosa para realizar operações matemáticas em Java. Seus métodos estáticos facilitam a execução de cálculos complexos sem a necessidade de criar instâncias da classe. Compreender e utilizar esses métodos pode ser extremamente útil em diversas aplicações, desde cálculos simples até algoritmos mais complexos.
