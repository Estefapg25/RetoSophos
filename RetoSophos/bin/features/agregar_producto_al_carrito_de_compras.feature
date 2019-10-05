#---------------------------------------------------RETO SOPHOS-----------------------------------------------------------#
# 																						Author: estefapg25@gmail.com 																								#
#																							encoding:ISO-8859-1																													#
#																																																													#
#-------------------------------------------------------------------------------------------------------------------------#
@tag
Feature: Agregar productos al carrito de compras
  Yo como cliente
  Deseo buscar un producto y agregarlo al carrito de compras

  @ClienteBuscaYAgregaProductoAlCarroDeCompras
  Scenario Outline: Validar que cuando cliente busque un producto y lo agregue para comprarlo aparezca dicho producto en el carrito de compras
    Given el cliente ingresa a la pagina de vivanda
    When el cliente busca un producto y lo agrega a la canasta de compra
      | nombreProducto   |
      | <nombreProducto> |
    Then el cliente puede ver el producto en el carrito de compras
      | descripcionProducto   |
      | <descripcionProducto> |

    Examples: 
      | nombreProducto | descripcionProducto |
      | COCA COLA      | Gaseosa COCA COLA   |
