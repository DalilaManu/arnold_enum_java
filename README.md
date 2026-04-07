#  Enum Types: Arnold

Este proyecto introduce un concepto fundamental de la programación en Java:  
los tipos enumerados (`enum`).

Además, aplica un ejemplo práctico utilizando la constante universal de gravitación para calcular el peso de una persona en cada planeta del Sistema Solar.

---

## Objetivo

Calcular el peso de una persona en la superficie de cada planeta usando fórmulas físicas reales.

---

## Fórmulas utilizadas

###  Peso en la superficie

Peso_superficie = Masa_humano × Gravedad_superficie

---

###  Gravedad en la superficie

Gravedad_superficie = (G × Masa_planeta) / Radio_planeta²

Donde:

G = 6.67300 × 10⁻¹¹ N·m²/kg²

---

### Masa del humano

Masa_humano = Peso_Tierra / Gravedad_Tierra

---

## Datos de los planetas

Cada planeta está definido en un `enum` con:

- Masa (kg)
- Radio (m)

| Planeta  | Masa (kg)  | Radio (m)  |
|----------|------------|------------|
| MERCURY  | 3.303e+23  | 2.4397e6   |
| VENUS    | 4.869e+24  | 6.0518e6   |
| EARTH    | 5.976e+24  | 6.37814e6  |
| MARS     | 6.421e+23  | 3.3972e6   |
| JUPITER  | 1.9e+27    | 7.1492e7   |
| SATURN   | 5.688e+26  | 6.0268e7   |
| URANUS   | 8.686e+25  | 2.5559e7   |
| NEPTUNE  | 1.024e+26  | 2.4746e7   |


