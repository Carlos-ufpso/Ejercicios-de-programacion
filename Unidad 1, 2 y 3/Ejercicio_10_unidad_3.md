+---------------------+              +-----------------+      +-----------------------------+    +------------------------+
|     Usuario         |--------------|  Bibliotecario  |------|      Libro                  |----|   Préstamo             |
+---------------------+              +-----------------+      +-----------------------------+    +------------------------+
| - id: int           |              | - id: int       |      | - isbn: String              |    | - id: int              |
| - nombre: String    |              | - nombre: String|      | - título: String            |    | - idUsuario: int       |
| - dirección: String |              | - turno: String |      | - autor: String             |    | - idLibro: int         |
| - teléfono: String  |              |                 |      | - editorial: String         |    | - fechaPrestamo: Date  |
| - email: String     |              |                 |      | - añoPublicación: int       |    | - fechaDevolución: Date|
| - contraseña: String|              |                 |      | - ejemplaresDisponibles: int|    +------------------------+
+---------------------+              +-----------------+      | - idCategoria: int          |
                                                              +-----------------------------+
            |                                  |
            |                                  |
            V                                  V
+-------------------------+           +-----------------+
|      Multa              |           |    Categoría    |
+-------------------------+           +-----------------+
| - id: int               |           | - id: int       |
| - idUsuario: int        |           | - nombre: String|
| - monto: float          |           +-----------------+
| - estado: String        |           
| - fechaImposición: Date |
| - fechaPago: Date       |
+-------------------------+
            |
            |
            V
+---------------------+
|     Reserva         |
+---------------------+
| - id: int           |
| - idUsuario: int    |
| - idLibro: int      |
| - fechaReserva: Date|
| - estado: String    | 
+---------------------+
          |
          |
          V
+-------------------+
|    Notificación   |
+-------------------+
| - id: int         |
| - idUsuario: int  |
| - mensaje: String |
| - tipo: String    |
| - fechaEnvio: Date|
+-------------------+
