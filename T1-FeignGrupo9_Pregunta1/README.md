# T1 Tipo D (Pregunta 1) — Grupo 9 · Brewery con Feign

| Nro. | Código | Nombres | Apellidos | Coordinador | Grupo |
|---|---|---|---|---|---|
| 6 | I202501591 | Maria | Huaman Pahuara |  | Grupo 9 |

Cliente Feign que obtiene todas las cervecerías
(`GET https://api.openbrewerydb.org/v1/breweries`) y filtra las de tipo
`"micro"` en el estado `"California"`.

Clases: `BreweryData` (id, name, brewery_type, state), interfaz
`BreweryClient` (`@FeignClient`) y `BreweryService.getMicroCalifornia()`.

Versiones: **Spring Boot 4.1.1 · Spring Cloud 2025.1.3 · Java 25**.

## Requisitos

- **JDK 25** y **IntelliJ IDEA** (abrir esta carpeta, SDK = 25).
- Maven solo si corres por consola; con el ▶ de IntelliJ no hace falta.

## Correr

Windows:

```powershell
cd T1-FeignGrupo9_Pregunta1
mvn spring-boot:run
```

Linux o Mac:

```bash
cd T1-FeignGrupo9_Pregunta1
mvn spring-boot:run
```

## Probar

```bash
curl "http://localhost:8081/api/breweries/micro-california"
```

Respuesta esperada: lista con cervecerías `micro` de `California`
(ver `evidencias/`).

— Maria Huaman Pahuara
