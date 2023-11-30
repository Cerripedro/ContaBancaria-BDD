package org.example;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Conta {

    /**
     * @author Pedro Cerri
     * @version 1.0
     * @param int1 Este é o primeiro parametro
     * @throws Throwable
     */

    @Given("um cliente especial com saldo atual de {int} reais")
    public void um_cliente_especial_com_saldo_atual_de_reais(Integer int1) {
        System.out.println("Saldo do cliente Especial: " + int1);
    }

    @When("for solicitado um saque no valor de {int} reais")
    public void for_solicitado_um_saque_no_valor_de_reais(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Saque requisitado pelo cliente especial: " + int1);
    }


    @Then("deve efetuar o saque e atualizar o saldo da conta para {int} reais")
    public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Saque realizado com sucesso para o cliente especial");
    }


    @Given("um cliente comum com saldo atual de {int} reais")
    public void um_cliente_comum_com_saldo_atual_de_reais(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Saldo atual do cliente comum: " + int1);
    }


    @When("solicitar um saque de {int} reais")
    public void solicitar_um_saque_de_reais(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Saque requisitado pelo cliente comum: " + int1);
    }


    @Then("não deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente")
    public void não_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_saldo_insuficiente() {
        System.out.println("SALDO INSUFICIENTE! SE TORNE UM CLIENTE ESPECIAL PARA PODER SACAR MESMO NÃO TENDO DINHEIRO");
    }

    @Then("check more outcomes$")
    public void check_more_outcomes() {
        System.out.println("Check more outcomes");
    }
}
