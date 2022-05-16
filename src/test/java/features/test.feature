Feature: Busqueda en google.es
  Como usuario busco Orange Bank en google para comprobar la cantidad de resultados mostrados
  Scenario: Comprobar resultados de busqueda de google.es
    Given El usuario se encuentra en el buscador de google
    When Ingresa Orange Bank en el buscador y haclic en el boton buscar
    Then Comprueba numero de resultados obtenidos sean superiores a 100.000
