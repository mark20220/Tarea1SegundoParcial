------------------------------------------------------------------------
Practica 1 Segundo Parcial

Realiza algoritmos para resolver los siguientes problemas.
Ejercicio 1
Genera hasta el n-simo termino de la siguiente serie.
Ej:
Numero dado por parámetro: 10
Respuesta: 1 2 4 7 9 10 12 15 17 18

Ejercicio 2
Genera hasta el n-simo termino de la sucesión padovan.
Ej:
Numero dado por parámetro: 12
Respuesta: 1 1 1 2 2 3 4 5 7 9 12 16
------------------------------------------------------------------------

PROJECT TITLE:Tarea 1
PURPOSE OF PROJECT:Algoritmos
VERSION or DATE:11/05/2021
HOW TO START THIS PROJECT:
AUTHORS:Marcelo oscar cardozo cadima
USER INSTRUCTIONS:
Ejercicio 1
Serie (Numero: Entero)
Inicio
	Contador: Entero
	Resultado: Entero
	Contador=1
	Resultado=1
	Para (i=1; hasta Numero; i+1) 
	hacer
		Si Contador Es 4
		Entonces
			Resultado = Resultado + (Contador-2)
			Contador+1
		Sino
			Resultado = Resultado + Contador
			Contador+1
	retornar Resultado
Fin

Ejercicio 2
Padovan (Numero: Entero)
Inicio
	Auxiliar: Entero
	Ultimo: Entero
	Penúltimo: Entero
	Actual: Entero
	Ultimo=1
	Penúltimo=0
	Actual=1
	Para (i=1; hasta Numero; i+1)
	Hacer
		Auxiliar = ultimo + Penúltimo
		Ultimo = Penúltimo
		Penúltimo = Actual
		Actual = Auxiliar
	retornar Actual
Fin

