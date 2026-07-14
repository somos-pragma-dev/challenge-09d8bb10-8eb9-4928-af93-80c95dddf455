# Implementación de TDD en un sistema de gestión de préstamos

En el contexto de un sistema de gestión de préstamos para una institución financiera, debes aplicar TDD para mejorar la calidad del software. El sistema debe manejar solicitudes de préstamos, validar los datos de entrada, calcular la elegibilidad del préstamo y registrar la solicitud en la base de datos. Los actores involucrados son el solicitante del préstamo, el sistema de evaluación de riesgos y el registro de préstamos. El sistema debe garantizar la idempotencia del registro de la solicitud por número de operación y canal, asegurando que dos invocaciones con la misma clave produzcan un solo registro y devuelvan la misma respuesta dentro de 24 horas. Debes considerar modos de falla específicos como timeout del sistema de evaluación de riesgos superior a 2 segundos o respuestas 5xx del core bancario.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Mejora de la calidad del software mediante TDD y el ciclo rojo-verde-refactor |
| **Nivel** | advanced-l1 |
| **Tipo** | practical |
| **Tiempo estimado** | 8 horas |

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

### Fase 1: Configuración del entorno de pruebas

**Objetivo:** Establecer un entorno de pruebas que permita aplicar TDD en el desarrollo del sistema de gestión de préstamos.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Identificar las dependencias necesarias para aplicar TDD en el proyecto.
- Configurar el entorno de pruebas para permitir la ejecución de pruebas unitarias y de integración.

**Entregable:** Entorno de pruebas configurado y listo para la aplicación de TDD.

<details>
<summary>Pistas de conocimiento</summary>

- Identificación de las herramientas y librerías necesarias para aplicar TDD en Java.
- Configuración de un entorno de pruebas que permita la ejecución de pruebas unitarias y de integración.

</details>

### Fase 2: Desarrollo de la funcionalidad de solicitud de préstamo

**Objetivo:** Implementar la funcionalidad de solicitud de préstamo utilizando TDD, asegurando la validación de datos de entrada y el cálculo de la elegibilidad del préstamo.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Escribir pruebas unitarias para la validación de datos de entrada y el cálculo de la elegibilidad del préstamo.
- Implementar la funcionalidad de solicitud de préstamo, asegurando que pase todas las pruebas unitarias.

**Entregable:** Funcionalidad de solicitud de préstamo implementada y verificada mediante pruebas unitarias.

<details>
<summary>Pistas de conocimiento</summary>

- Aplicación de TDD para escribir pruebas unitarias antes de implementar la funcionalidad.
- Validación de datos de entrada y cálculo de la elegibilidad del préstamo.

</details>

### Fase 3: Integración con el sistema de evaluación de riesgos

**Objetivo:** Integrar la funcionalidad de solicitud de préstamo con el sistema de evaluación de riesgos, asegurando la idempotencia del registro de la solicitud por número de operación y canal.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Escribir pruebas de integración para la interacción con el sistema de evaluación de riesgos.
- Implementar la integración con el sistema de evaluación de riesgos, asegurando la idempotencia del registro de la solicitud por número de operación y canal.

**Entregable:** Integración con el sistema de evaluación de riesgos implementada y verificada mediante pruebas de integración.

<details>
<summary>Pistas de conocimiento</summary>

- Aplicación de TDD para escribir pruebas de integración antes de implementar la integración.
- Garantía de la idempotencia del registro de la solicitud por número de operación y canal.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es TDD y cómo se aplica en el desarrollo de software?
- **paraQueSirve**: ¿Para qué sirve aplicar TDD en el desarrollo de software?
- **comoSeUsa**: ¿Cómo se usa TDD para escribir pruebas unitarias y de integración en Java?
- **erroresComunes**: ¿Cuáles son los errores comunes al aplicar TDD en el desarrollo de software?
- **queDecisionesImplica**: ¿Qué decisiones implica la aplicación de TDD en el desarrollo de software?

## Criterios de Evaluacion

- Configuración correcta del entorno de pruebas para aplicar TDD.
- Implementación de la funcionalidad de solicitud de préstamo utilizando TDD.
- Integración con el sistema de evaluación de riesgos asegurando la idempotencia del registro de la solicitud por número de operación y canal.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
