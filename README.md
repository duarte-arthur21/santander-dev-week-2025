# Santander Dev Week 2025
Java RESTful API criada para a Santander Dev Week.

## Diagrama de Classes

```mermaid
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

    Usuario "1" *--> "1" Conta : possui
    Usuario "1" *--> "N" Feature : tem
    Usuario "1" *--> "1" Cartao : possui
    Usuario "1" *--> "N" Noticia : recebe
```
