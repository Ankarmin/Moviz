# **MOVIZ**
Moviz fue una idea innovadora pensada para ofrecer a los usuarios una experiencia interactiva con una amplia variedad de títulos de películas, inspirada en la creciente demanda de plataformas digitales de entretenimiento. En Moviz, los clientes pueden acceder al perfil detallado de cada película, puntuarla y dejar comentarios sobre su experiencia. Además de estas interacciones, los usuarios tendrán la opción de alquilar películas de su interés, brindando una solución completa para disfrutar del cine desde la comodidad de su hogar.

## **INTEGRANTES**
-	Arancivia Salas, Christian Gabriel
-	Segovia Valencia Jim Bryan Jordan
-	Arevalo Mauricio Diego Martin
-	Chavez Cerna, Joshua Nicolas
-	Ticlla Vento, Esther Noemí
-	Piñarreta Rojas David Sebastian
-	Huarcaya Juscamayta Nelson Alejandro

## **FUNCIONALIDADES PRINCIPALES**
Al iniciar el software, se despliega una ventana donde el usuario debe ingresar la información requerida para acceder a las funcionalidades del programa. Según los datos proporcionados, el sistema identificará si el usuario es un cliente o un administrador, determinando el acceso a diferentes características, las cuales se describirán a continuación.

![image](https://github.com/user-attachments/assets/55353556-a34e-44df-a60e-f2bdc13150cd "Ventana de Login")

### *CLIENTE*
El cliente tendrá las siguientes funcionalidades:
- Acceder al perfil de cada película.
- Puntuar las películas.
- Dejar comentarios sobre las películas.
- Alquilar películas de su interés.

### *ADMINISTRADOR*
El administrador tendrá las siguientes funcionalidades:
- Añadir nuevas películas al catálogo.
- Eliminar comentarios dejados por los usuarios.

## **DETALLES**
### ARQUITECTURA
En este proyecto se utilizó el patrón de diseño de software llamado MVC (Modelo-Vista-Controlador) que organiza el desarrollo de aplicaciones en tres componentes interrelacionados pero independientes. Su principal objetivo es separar las responsabilidades de la aplicación para mejorar la modularidad, la reutilización de código y la facilidad de mantenimiento.
#### *MODELO*
Gestiona los datos, la lógica de negocio y las reglas de la aplicación. Es el encargado de interactuar con la base de datos y otros servicios.

![image](https://github.com/user-attachments/assets/e55a4ddb-c562-4daa-8aa0-8eca5c82bef7 "Directorio del proyecto")

#### *VISTA*
Representa la interfaz de usuario. Se encarga de mostrar los datos del modelo al usuario y captar la interacción de este.

![image](https://github.com/user-attachments/assets/d741efce-b1a2-4b1d-b4d5-4bad5f4bc73c "Directorio del proyecto")

#### *CONTROLADOR*
Actúa como intermediario entre la vista y el modelo. Recibe las entradas del usuario desde la vista, procesa las solicitudes y actualiza el modelo y/o la vista según corresponda.

![image](https://github.com/user-attachments/assets/f285a49a-1961-462f-880a-ba7b210e2943 "Directorio del proyecto")

## **TRABAJO COLABORATIVO**
Para trabajar colaborativamente, utilizamos la herramienta Github. Esto debido a que permite a varios desarrolladores trabajar en un proyecto usando control de versiones. Los colaboradores pueden crear ramas para desarrollar nuevas funciones, hacer commits para guardar cambios y usar pull requests para proponer modificaciones que otros revisan antes de fusionar. GitHub también permite gestionar tareas con issues y automatizar pruebas con integración continua, facilitando un desarrollo organizado y eficiente.

![image](https://github.com/user-attachments/assets/5ae34143-7f63-4add-a98e-5262ed51b22b "Repositorio en Github")
