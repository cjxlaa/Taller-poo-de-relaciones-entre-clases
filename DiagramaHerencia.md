```mermaid
classDiagram
    class Empleado {
        #String nombre
        +Empleado(String nombre)
        +trabajar()
    }
    class Desarrollador {
        -String lenguaje
        +Desarrollador(String nombre, String lenguaje)
        +programar()
    }
    Empleado <|-- Desarrollador