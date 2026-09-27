# T1 Tipo D (Pregunta 1, Problema 3) — Grupo 9 · SWAPI con Feign

| Nro. | Código | Nombres | Apellidos | Coordinador | Grupo |
|---|---|---|---|---|---|
| 6 | I202501591 | Maria | Huaman Pahuara |  | Grupo 9 |

Cliente Feign que obtiene los personajes de Star Wars de la primera página
(`GET https://swapi.dev/api/people/`) donde el género es `"female"` y la altura
es mayor a 160 (la API devuelve la altura como String, por eso se parsea).

Clases: `StarWarsCharacter` (name, height, gender) + `SwapiResponse` (wrapper de la
paginación), interfaz `SwapiClient` (`@FeignClient`) y `SwapiService.getTallFemaleCharacters()`.

Versiones exigidas: **Spring Boot 4.1.1 · Spring Cloud 2025.1.3 · Java 25** (ya fijadas en el `pom.xml`).

## 1. Requisitos

- **JDK 25** (`java -version` debe decir 25 en la terminal que uses).
  - Windows: instalar desde [oracle.com](https://www.oracle.com/java/technologies/downloads/) o Temurin y dejarlo como JDK por defecto.
  - Linux: el paquete de tu distro (ej. `sudo pacman -S jdk25-openjdk` o `sudo apt install temurin-25-jdk`) y seleccionarlo por defecto.
  - Mac: con Homebrew `brew install openjdk@25` (luego `java -version` debe decir 25; si no, enlázalo con `sudo ln -sfn $(brew --prefix openjdk@25)/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk-25.jdk`), o instala el `.pkg` de Oracle/Temurin.
- **IntelliJ IDEA** (Community basta; igual en los tres sistemas). Al abrir el proyecto, en `File → Project Structure → Project → SDK` debe quedar el JDK 25. Si sale "Cannot resolve symbol" en todo, casi seguro es eso.
- Internet (Maven descarga dependencias la primera vez + la API de SWAPI).
- Puerto libre: 8081.

## 2. Importar y correr

`File → Open…` → carpeta `Problema3SwapiGrupo9` → `Trust Project`. Esperar a que termine
"Importing Maven project" (si no descarga dependencias: botón "Reload All Maven Projects").

Correr `Problema3SwapiGrupo9Application.java` con el ▶ verde (recomendado, no requiere nada más).

### Si estás en Windows

Por consola (requiere Maven: descárgalo de [maven.apache.org](https://maven.apache.org/download.cgi), agrega su `bin` al PATH y verifica con `mvn -version` en una terminal nueva):

```powershell
cd Problema3SwapiGrupo9
mvn spring-boot:run
```

(Si no quieres instalar Maven, usa el ▶ de IntelliJ, que ya trae el suyo.)

### Si estás en Linux o Mac

Por consola (requiere Maven: `sudo pacman -S maven` / `sudo apt install maven` / `brew install maven`; verifica con `mvn -version`):

```bash
cd Problema3SwapiGrupo9
mvn spring-boot:run
```

(Si no quieres instalar Maven, usa el ▶ de IntelliJ, que ya trae el suyo.)

## 3. Probar

### Si estás en Windows

```powershell
curl.exe http://localhost:8081/api/swapi/tall-female
```

### Si estás en Linux o Mac

```bash
curl http://localhost:8081/api/swapi/tall-female
```

### Resultado esperado (igual en los tres sistemas)

```json
[{"gender":"female","height":"165","name":"Beru Whitesun lars"}]
```

## 4. Si algo falla

- **`swapi.dev` caído o lento en la demo**: es una API externa inestable; respaldo: cambiar la `url` del `SwapiClient` a `https://swapi.info/api` o `https://www.swapi.tech/api`.
- **Puerto 8081 ocupado**: cambiar el `port` en el `application.yml`.
- **Maven no resuelve dependencias**: revisar internet/proxy y reintentar el reload de Maven.
