# language: es

Característica: Realizar compras de artículos
  Como un nuevo cliente
  Quiero ingresar a la página www.automationpractice.com
  Para realizar una compra de un artículo

  Antecedentes:
    Dado (precondiciones) que un nuevo cliente Arturo accede hasta la web de compras

  @EscenarioSinEjemplos
  Escenario: Agregar artículos al carrito de compras
    Cuando el agrega 3 prendas, dresses al carro
    Entonces el ve los productos listado en el carro de compras

  @EscenarioConEjemplos
  Esquema del escenario: Agregar artículos al carrito de compras
    Cuando el agrega productos al carro
      | <cantidadAgregar> | <nombreProducto> |
    Entonces el ve los productos listado en el carro de compras

    Ejemplos:
      | cantidadAgregar | nombreProducto                         |
      | 3               | Printed Dress                          |
      | 4               | Printed Summer Dress                   |
      | 5               | Printed Chiffon Dress                  |