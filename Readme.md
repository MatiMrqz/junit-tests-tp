# 🧪 Testing Unitario con JUnit

## 📘 Descripción del Trabajo Práctico

Este trabajo práctico tiene como objetivo introducir el uso del framework **JUnit** para la creación y ejecución de **pruebas unitarias** en el lenguaje Java.  
A través de ejemplos concretos, se busca comprender cómo validar el correcto funcionamiento de clases y métodos mediante aserciones y manejo de excepciones.

El proyecto incluye dos módulos principales:
- `ConversorTemperatura`
- `CuentaBancaria`

Cada uno cuenta con su respectiva clase de test desarrollada bajo **JUnit 6 (Jupiter)**.

---

## ⚙️ Requisitos Técnicos

- **JDK:** 8 o superior  
- **JUnit:** versión 6.0.0 o posterior  
- **IDE sugerido:** IntelliJ IDEA / Eclipse / NetBeans  
- **Sistema de construcción:** **Gradle**

Dependencia Gradle recomendada:

```gradle
dependencies {
    testImplementation 'org.junit.jupiter:junit-jupiter-api:5.7.0'
    testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.7.0'
}

test {
    useJUnitPlatform()
}
```

---

## 🧱 Estructura del Proyecto

```
src/
├── main/java/org/example/
│   ├── ConversorTemperatura/
│   │   ├── ConversorTemperatura.java
│   │   └── NullTemperatureNotAllowed.java
│   └── CuentaBancaria/
│       ├── CuentaBancaria.java
│       └── InsufficientFundsException.java
└── test/java/
    ├── ConversorTemperaturaTest.java
    └── CuentaBancariaTest.java
```

---

## 🧩 Descripción de los Casos de Prueba

### 1. ConversorTemperaturaTest

Ubicación: `src/test/java/ConversorTemperaturaTest.java`

Esta clase prueba el correcto funcionamiento de las conversiones entre Celsius y Fahrenheit, así como el manejo de valores nulos.

#### Métodos probados

| Método               | Entrada | Salida esperada                   | Propósito                         |
| -------------------- | ------- | --------------------------------- | --------------------------------- |
| `toFahrenheit(0F)`   | 0°C     | 32°F                              | Verifica conversión a Fahrenheit  |
| `toCelsius(32F)`     | 32°F    | 0°C                               | Verifica conversión a Celsius     |
| `toFahrenheit(null)` | null    | Lanza `NullTemperatureNotAllowed` | Comprueba manejo de valores nulos |

#### Ejemplo de ejecución

```
Tests ConversorTemperatura
✔ toFahrenheitTest() → OK
✔ toCelsiusTest() → OK
✔ nullValueHandlingTest() → OK
```

---

### 2. CuentaBancariaTest

Ubicación: `src/test/java/CuentaBancariaTest.java`

Evalúa las operaciones básicas de una cuenta bancaria: depósito, retiro válido y manejo de retiros excedentes.

#### Métodos probados

| Método              | Entrada             | Resultado esperado                 | Propósito                         |
| ------------------- | ------------------- | ---------------------------------- | --------------------------------- |
| `depositar(234.2D)` | Saldo inicial: 1000 | 1234.2                             | Verifica suma de depósitos        |
| `retirar(12.2D)`    | Saldo inicial: 1000 | 987.8                              | Verifica resta correcta           |
| `retirar(1001D)`    | Saldo inicial: 1000 | Lanza `InsufficientFundsException` | Controla retiros mayores al saldo |

#### Ejemplo de ejecución

```
Iniciando Test de CuentaBancaria
✔ testDepositar() → OK
✔ testRetiro() → OK
✔ testLimiteRetiro() → OK
```

---

## 🔁 Ciclo de Vida de las Pruebas

JUnit utiliza anotaciones para controlar el flujo de ejecución:

| Anotación    | Descripción                                        |
| ------------ | -------------------------------------------------- |
| `@BeforeAll` | Se ejecuta una vez antes de todos los tests.       |
| `@Test`      | Marca un método como caso de prueba.               |
| `@AfterAll`  | Se ejecuta una vez al finalizar todas las pruebas. |

---

## ✅ Buenas Prácticas Aplicadas

* Cada prueba valida **una sola funcionalidad**.
* Uso de **aserciones específicas** (`assertEquals`, `assertThrows`).
* **Mensajes descriptivos** en consola para distinguir los tests.
* Evita dependencias externas o acceso a recursos no controlados.
* Diseño orientado a **Test Driven Development (TDD)**.

---

## 🧠 Conclusión

JUnit es una herramienta fundamental para garantizar la calidad del software Java.
Este trabajo práctico permitió aplicar los conceptos de **prueba unitaria** y **TDD**, validando el correcto comportamiento de las clases mediante pruebas automatizadas, rápidas y repetibles.

---

## 📄 Autores y Créditos

**Cátedra:** Desarrollo de Software 
**Tema:** Testing Unitario con JUnit  
**Institución:** Universidad Tecnológica Nacional - Facultad Regional Mendoza
**Año:** 2025  

**Integrantes del grupo:**
- Bruno Zaupa  
- Candela Fernandez  
- Emiliano Echavarria  
- Julián Fernandez  
- Macarena Copparoni  
- Matías Márquez  
- Soledad Montenegro
