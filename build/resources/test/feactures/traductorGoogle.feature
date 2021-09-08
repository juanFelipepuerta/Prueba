#Autor: Juan Felipe Puerta
@cp
Feature:como un usuario,  Quiero ingresar a google Translator,  A traducir palabras entre diferentes lenguajes
  @scenario1
  Scenario: : :Traducir de Ingles a Español
    Given que Felipe quiere usar el traductor de google

    When  el traduce una palabra de ingles a español
      | origen  | destino|palabrai|
      | ingles  | espanol| table |
      |espanol  |ingles  |mesa   |
    Then  el deberia ver la palabra traducida del idioma origen a idioma destino
      |palabrae|
      |mesa|
      |desk    |
