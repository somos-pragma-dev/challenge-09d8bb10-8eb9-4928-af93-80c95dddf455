# Implementación de TDD en un servicio de gestión de cuentas bancarias

En el contexto de un sistema de gestión de cuentas bancarias, debes implementar un servicio que maneje las operaciones de apertura, cierre y consulta de cuentas. El servicio interactúa con un repositorio de cuentas y un servicio de validación de identidad. Debes aplicar TDD para garantizar la calidad del software y seguir el ciclo rojo-verde-refactor. Los actores involucrados son el 'originador de créditos', el'motor antifraude' y el 'core bancario'. Las operaciones deben ser idempotentes con clave de operación y canal, y manejar adecuadamente los fallos del 'buró de riesgos' con timeouts superiores a 2 segundos.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Mejora de la calidad del software mediante TDD y el ciclo rojo-verde-refactor |
| **Nivel** | advanced-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Definición de requisitos y pruebas unitarias

**Objetivo:** Establecer los requisitos funcionales y no funcionales del servicio y escribir las primeras pruebas unitarias.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Identificar los requisitos funcionales y no funcionales del servicio de gestión de cuentas.
- Escribir pruebas unitarias para las operaciones de apertura, cierre y consulta de cuentas utilizando TDD.

**Entregable:** Pruebas unitarias escritas y requisitos funcionales y no funcionales documentados.

<details>
<summary>Pistas de conocimiento</summary>

- Considera los diferentes estados que puede tener una cuenta bancaria.
- Piensa en los posibles fallos y cómo manejarlos en las pruebas.

</details>

### Fase 2: Implementación del servicio y refactorización

**Objetivo:** Implementar el servicio de gestión de cuentas y refactorizar el código para mejorar su calidad.

**Tiempo estimado:** 4 horas

**Instrucciones:**

- Implementar el servicio de gestión de cuentas siguiendo el ciclo rojo-verde-refactor.
- Refactorizar el código para mejorar su legibilidad, mantenibilidad y rendimiento.

**Entregable:** Servicio de gestión de cuentas implementado y refactorizado.

<details>
<summary>Pistas de conocimiento</summary>

- Considera la idempotencia de las operaciones y cómo garantizarla.
- Piensa en las posibles optimizaciones para mejorar el rendimiento del servicio.

</details>

### Fase 3: Evaluación y documentación

**Objetivo:** Evaluar el servicio implementado y documentar el proceso de desarrollo.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Evaluar el servicio implementado para asegurar que cumple con los requisitos y es robusto ante diferentes escenarios.
- Documentar el proceso de desarrollo utilizando TDD y el ciclo rojo-verde-refactor.

**Entregable:** Evaluación del servicio y documentación del proceso de desarrollo.

<details>
<summary>Pistas de conocimiento</summary>

- Considera los diferentes escenarios de prueba para evaluar el servicio.
- Piensa en cómo documentar el proceso de desarrollo de manera clara y concisa.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es TDD y cómo se aplica en el desarrollo de software?
- **paraQueSirve**: ¿Para qué sirve el ciclo rojo-verde-refactor en el desarrollo de software?
- **comoSeUsa**: ¿Cómo se usa TDD para mejorar la calidad del software?
- **erroresComunes**: ¿Cuáles son los errores comunes al aplicar TDD y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones implica la aplicación de TDD en el desarrollo de software?

## Criterios de Evaluacion

- Implementación de pruebas unitarias utilizando TDD.
- Aplicación del ciclo rojo-verde-refactor en la implementación del servicio.
- Refactorización del código para mejorar su calidad.
- Evaluación del servicio implementado para asegurar que cumple con los requisitos.
- Documentación clara y concisa del proceso de desarrollo utilizando TDD y el ciclo rojo-verde-refactor.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
