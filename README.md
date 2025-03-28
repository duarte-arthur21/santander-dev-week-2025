# Santander Dev Week 2025
Java RESTful API criada para a Santander Dev Week.

## Diagrama de Classes

``` Mermaid
classDiagram
    class Usuario {
        -String name
    }

    class Conta {
        -String number
        -double balance
        -double limit
    }

    class Feature {
        -String icon
        -String description
    }

    class Cartao {
        -String number
        -double limit
    }

    class Noticia {
        -String icon
        -String description
    }

    Usuario --> Conta : possui
    Usuario --> Cartao : possui
    Usuario --> "0..*" Feature : tem
    Usuario --> "0..*" Noticia : recebe

```
