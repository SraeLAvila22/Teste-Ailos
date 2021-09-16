#Author: israeljdavila@gmail.com

@RunAll
Feature: Fazer compras
  Eu como usuario quero logar na minha conta para efetuar compras

	Background: acessar o site
		Given que eu esteja no site "https://www.saucedemo.com"

@RunCT01
  Scenario: CT01 - Fazer login com usuario bloqueado
    When preencher os dados de usuario bloqueado
    Then Valido a mensagem de bloqueio exibida
    
@RunCT02    
  Scenario: CT02 - Fazer compras
  	When preencher os dados de login validos
  	And escolher meus produtos
  	Then finalizo minhas compras
  	
@RunCT03  
  Scenario: CT03 - Comprar todos os produtos
  	When preencher os dados de login validos
  	And selecionar todos os produtos da loja
		Then valido o valor total a ser pago


