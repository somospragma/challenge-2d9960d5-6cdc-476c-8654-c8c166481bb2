# Prompt para Mejorar el Codigo Base

Copia y pega el siguiente contenido completo en un asistente de IA (Claude, ChatGPT, etc.)
para obtener un ZIP con el proyecto arrancable. Si el adjunto es una carcasa (docs/placeholders),
el asistente debe materializar la estructura del stack del briefing, sin resolver las fases del reto.

---

```
## Briefing del reto (autoridad)
Este bloque manda sobre los archivos adjuntos. El stack y el rol salen de AQUÍ, no de un topic genérico ni de markdown placeholder.

### Perfil
Chapter Backend, Especialidad Desarrollador, Tecnología Java, Senior

### Brecha de conocimiento
Ha trabajado con un asistente de IA (Github Copilot / Amazon CodeWhisperer / etc).

### Misión / candidato
Candidato con experiencia senior en backend, listo para integrar herramientas de IA en su flujo de desarrollo.

### Reto
- Tema: Desarrollo
- Seniority: senior-l3
- Tipo: practical
- Título: Integración de herramientas de IA en el flujo de desarrollo
- Tiempo estimado: 4-6 horas

### Fases (trabajo del HUMANO — PROHIBIDO completarlas)
No implementes estos entregables. Dejalos como hueco pedagógico. El asistente solo materializa el proyecto arrancable para que el participante pueda trabajar.
- Fase 1: Exploración del problema — objetivo: Identificar las necesidades del equipo y los puntos de integración posibles con herramientas de IA. — entregable (NO resolver): Documento con las necesidades del equipo y los puntos de integración posibles.
- Fase 2: Evaluación de las sugerencias de código — objetivo: Evaluar la aplicabilidad de las sugerencias de código generadas por la herramienta de IA. — entregable (NO resolver): Documento con la evaluación de las sugerencias de código.
- Fase 3: Integración de las sugerencias en el flujo de trabajo — objetivo: Integrar las sugerencias de código evaluadas en el flujo de trabajo del equipo. — entregable (NO resolver): Documento con el proceso de integración y las decisiones tomadas.

Eres un asistente experto en análisis, corrección y generación de archivos de cualquier tipo:
código fuente, documentación, hojas de cálculo, documentos Word, configuraciones, entre otros.
Voy a enviarte una cadena de texto que contiene uno o más archivos. Cada archivo está delimitado por un marcador con el siguiente formato:
// === ARCHIVO: ruta/del/archivo.extension ===
o también puede aparecer como:
## === ARCHIVO: ruta/del/archivo.extension ===
Lo que sigue al marcador puede ser:

El contenido real del archivo (código, texto, YAML, etc.)
Una descripción en lenguaje natural de lo que debe contener el archivo


TU TAREA
PASO 1 — Detección y extracción
Identifica todos los archivos presentes en la cadena. Para cada archivo extrae:

Su ruta completa (ej: src/main/java/com/pragma/Service.java)
Su contenido o descripción

PASO 2 — Clasificación por tipo
Clasifica cada archivo en una de estas categorías:
A) Código fuente (Java, Python, TypeScript, JavaScript, Kotlin, etc.)
B) Configuración / documentación (YAML, properties, Markdown, JSON, txt, etc.)
C) Excel (.xlsx, .xls, .csv)
D) Word (.docx, .doc)
E) Otro tipo de archivo binario o especial
PASO 3 — Clasificación de errores en código fuente

Objetivo prioritario: que el proyecto compile. No corrijas flujo de negocio ni lógica funcional.

Antes de modificar cualquier archivo de código fuente, clasifica cada problema encontrado en una de estas dos categorías:
🔴 ERROR DE COMPILACIÓN — corregir siempre
Son errores que impiden que el proyecto arranque, sin valor pedagógico:

Import faltante o incorrecto
Clase, método o variable referenciada que no existe en ningún archivo del proyecto
Error de sintaxis
Anotación con atributos inválidos
Dependencia ausente en pom.xml, package.json, etc.
Archivo referenciado que no existe y debe ser creado con implementación mínima

→ CORREGIR estos errores.
🟡 PROBLEMA FUNCIONAL O DE CALIDAD — preservar siempre
Son problemas que no impiden compilar. Pueden ser intencionales para el aprendizaje:

Clave secreta hardcodeada ("secret", "password123")
API deprecada que funciona pero tiene reemplazo moderno
Lógica de negocio incorrecta o incompleta
Código redundante o de baja legibilidad
Falta de validaciones en flujo de negocio
Patrones de diseño incorrectos pero funcionales
Concurrencia no segura
Configuración funcional pero no óptima

→ PRESERVAR tal cual. No corregir, no mejorar, no comentar.
PASO 4 — Procesamiento según tipo de archivo
Tipo A — Código fuente
Aplica únicamente las correcciones clasificadas como 🔴 ERROR DE COMPILACIÓN.
No alteres ningún elemento clasificado como 🟡 PROBLEMA FUNCIONAL O DE CALIDAD.
Si falta un archivo referenciado, créalo con la implementación mínima necesaria para compilar.
Tipo B — Configuración / documentación
Extrae el contenido tal cual, sin modificaciones salvo errores evidentes de sintaxis
(ej: YAML mal indentado).
Tipo C — Excel (.xlsx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un archivo Excel funcional con:

Fila de encabezados en negrita con color de fondo distintivo
Columnas con ancho ajustado al contenido
Tipos de dato correctos por columna
Validaciones si la descripción lo indica
Hojas nombradas descriptivamente si hay más de una
Filas de ejemplo si no hay datos reales

Tipo D — Word (.docx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un documento Word funcional con:

Estilos de título (Título 1, Título 2) para jerarquía de secciones
Fuente legible (Calibri o equivalente), tamaño 11-12pt para cuerpo
Márgenes estándar
Tabla de contenido si tiene múltiples secciones
Tablas con encabezados en negrita si aplica

Tipo E — Otro
Genera el archivo con el contenido o estructura más apropiada según la descripción.
PASO 5 — Exportación en ZIP
Empaqueta todos los archivos en un único archivo ZIP descargable respetando exactamente
la estructura de rutas indicada por los marcadores.
El ZIP debe incluir:

Archivos de código con únicamente los errores de compilación corregidos
Archivos de configuración y documentación sin cambios
Archivos nuevos creados para resolver dependencias de compilación faltantes
Archivos Excel y Word generados desde descripción

IMPORTANTE: El ZIP debe estar listo para descargar al finalizar. No preguntes si el usuario
quiere generarlo. Simplemente genera el archivo y proporciona el enlace de descarga; No debes desplegar en el chat el resumen de lo que arreglaste al Zip, solo entregalo.

REGLAS IMPORTANTES

No omitas ningún archivo aunque no tenga errores ni modificaciones
Respeta los nombres y rutas exactas indicadas por los marcadores
Si un archivo no tiene marcador claro, infiere el nombre desde su contenido
Si la cadena contiene solo documentación o descripciones sin código, genera los archivos
correspondientes sin aplicar análisis de compilación
No agregues texto después del enlace de descarga del ZIP
No preguntes si el usuario quiere el ZIP: simplemente generalo siempre
Si detectas que falta un archivo de configuración necesario para compilar
(pom.xml, package.json, requirements.txt, build.gradle, etc.), créalo e inclúyelo
inferiendo su contenido desde los imports y frameworks detectados en el código
Nunca corrijas problemas 🟡 aunque parezcan obvios o fáciles de mejorar.
El participante que recibirá este proyecto los debe encontrar y resolver él mismo.


INPUT
Aquí está la cadena con los archivos:

package com.pragma.iaintegration.application;

import com.pragma.iaintegration.domain.IASuggestion;
import com.pragma.iaintegration.infrastructure.IAClient;
import org.springframework.stereotype.Service;

@Service
public class IAIntegrationService {
    private final IAClient iaClient;

    public IAIntegrationService(IAClient iaClient) {
        this.iaClient = iaClient;
    }

    public void integrateSuggestions() {
        // Lógica para integrar las sugerencias de IA en el flujo de desarrollo
        IASuggestion suggestion = iaClient.getSuggestion();
        // Procesar y aplicar la sugerencia
    }
}

// === ARCHIVO: src/main/java/com/pragma/iaintegration/domain/IASuggestion.java ===
package com.pragma.iaintegration.domain;

public record IASuggestion(String code, String description) {
}

// === ARCHIVO: src/main/java/com/pragma/iaintegration/infrastructure/IAClient.java ===
package com.pragma.iaintegration.infrastructure;

import com.pragma.iaintegration.domain.IASuggestion;
import org.springframework.stereotype.Component;

@Component
public class IAClient {
    public IASuggestion getSuggestion() {
        // Simular llamada a la herramienta de IA
        return new IASuggestion("System.out.println('Hello, World!');", "Imprime un mensaje de saludo");
    }
}

// === ARCHIVO: src/main/resources/config/application.yml ===
spring:
  profiles:
    active: dev

// === ARCHIVO: src/test/java/com/pragma/iaintegration/application/IAIntegrationServiceTest.java ===
package com.pragma.iaintegration.application;

import com.pragma.iaintegration.domain.IASuggestion;
import com.pragma.iaintegration.infrastructure.IAClient;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.when;

class IAIntegrationServiceTest {

    @Mock
    private IAClient iaClient;

    @InjectMocks
    private IAIntegrationService iaIntegrationService;

    public IAIntegrationServiceTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void integrateSuggestions() {
        IASuggestion suggestion = new IASuggestion("System.out.println('Hello, World!');", "Imprime un mensaje de saludo");
        when(iaClient.getSuggestion()).thenReturn(suggestion);
        iaIntegrationService.integrateSuggestions();
        // Verificar que se procesó y aplicó la sugerencia
    }
}

// === ARCHIVO: src/test/java/com/pragma/iaintegration/infrastructure/IAClientTest.java ===
package com.pragma.iaintegration.infrastructure;

import com.pragma.iaintegration.domain.IASuggestion;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;

class IAClientTest {

    @InjectMocks
    private IAClient iaClient;

    public IAClientTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void getSuggestion() {
        IASuggestion suggestion = iaClient.getSuggestion();
        assertEquals("System.out.println('Hello, World!');", suggestion.code());
        assertEquals("Imprime un mensaje de saludo", suggestion.description());
    }
}

// === ARCHIVO: src/main/java/com/pragma/iaintegration/IAIntegrationApplication.java ===
package com.pragma.iaintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IAIntegrationApplication {
    public static void main(String[] args) {
        SpringApplication.run(IAIntegrationApplication.class, args);
    }
}

// === ARCHIVO: src/main/java/com/pragma/iaintegration/controller/IAIntegrationController.java ===
package com.pragma.iaintegration.controller;

import com.pragma.iaintegration.application.IAIntegrationService;
import com.pragma.iaintegration.domain.IASuggestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/iaintegration")
public class IAIntegrationController {
    private final IAIntegrationService iaIntegrationService;

    @Autowired
    public IAIntegrationController(IAIntegrationService iaIntegrationService) {
        this.iaIntegrationService = iaIntegrationService;
    }

    @PostMapping("/integrate")
    public void integrateSuggestions() {
        iaIntegrationService.integrateSuggestions();
    }
}

// === ARCHIVO: pom.xml ===
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.pragma</groupId>
    <artifactId>iaintegration</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>iaintegration</name>
    <description>Demo project for Spring Boot</description>
    <properties>
        <java.version>21</java.version>
        <spring-boot.version>3.4.0</spring-boot.version>
    </properties>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
            <version>${spring-boot.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <version>${spring-boot.version}</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-databind</artifactId>
            <version>2.15.2</version>
        </dependency>
    </dependencies>
    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <version>${spring-boot.version}</version>
            </plugin>
        </plugins>
    </build>
</project>
```
