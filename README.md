# Integración de herramientas de IA en el flujo de desarrollo

El equipo de desarrollo de una empresa fintech necesita mejorar su eficiencia y calidad de código. Para lograrlo, se ha decidido integrar herramientas de asistencia de IA en el flujo de desarrollo. El sistema debe ser capaz de recibir sugerencias de código de una herramienta de IA y evaluar su aplicabilidad en el contexto del proyecto.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Desarrollo |
| **Nivel** | senior-l3 |
| **Tipo** | practical |
| **Tiempo estimado** | 4-6 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Exploración del problema

**Objetivo:** Identificar las necesidades del equipo y los puntos de integración posibles con herramientas de IA.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Investiga las herramientas de asistencia de IA disponibles en el mercado y sus características.
- Identifica los puntos de integración posibles en el flujo de desarrollo actual del equipo.

**Entregable:** Documento con las necesidades del equipo y los puntos de integración posibles.

<details>
<summary>Pistas de conocimiento</summary>

- Considera las ventajas y desventajas de cada herramienta de IA.
- Piensa en cómo se pueden integrar las sugerencias de código en el flujo de trabajo actual.

</details>

### Fase 2: Evaluación de las sugerencias de código

**Objetivo:** Evaluar la aplicabilidad de las sugerencias de código generadas por la herramienta de IA.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Selecciona una herramienta de asistencia de IA y genera sugerencias de código para un problema específico del proyecto.
- Evalúa la aplicabilidad de las sugerencias de código en el contexto del proyecto.

**Entregable:** Documento con la evaluación de las sugerencias de código.

<details>
<summary>Pistas de conocimiento</summary>

- Considera la calidad del código generado por la herramienta de IA.
- Piensa en cómo se pueden integrar las sugerencias de código en el flujo de trabajo actual.

</details>

### Fase 3: Integración de las sugerencias en el flujo de trabajo

**Objetivo:** Integrar las sugerencias de código evaluadas en el flujo de trabajo del equipo.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Selecciona las sugerencias de código más adecuadas y intégralas en el flujo de trabajo del equipo.
- Documenta el proceso de integración y las decisiones tomadas.

**Entregable:** Documento con el proceso de integración y las decisiones tomadas.

<details>
<summary>Pistas de conocimiento</summary>

- Considera los posibles impactos de la integración de las sugerencias en el flujo de trabajo.
- Piensa en cómo se pueden comunicar los cambios al equipo.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es una herramienta de asistencia de IA y cómo puede ayudar en el flujo de desarrollo?
- **paraQueSirve**: ¿Para qué sirve evaluar las sugerencias de código generadas por una herramienta de IA?
- **comoSeUsa**: ¿Cómo se pueden integrar las sugerencias de código en el flujo de trabajo del equipo?
- **erroresComunes**: ¿Cuáles son los errores comunes al integrar herramientas de asistencia de IA en el flujo de desarrollo?
- **queDecisionesImplica**: ¿Qué decisiones implica la integración de sugerencias de código generadas por una herramienta de IA en el flujo de trabajo del equipo?

## Criterios de Evaluacion

- Identificar las necesidades del equipo y los puntos de integración posibles con herramientas de IA.
- Evaluar la aplicabilidad de las sugerencias de código generadas por la herramienta de IA.
- Integrar las sugerencias de código evaluadas en el flujo de trabajo del equipo.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
