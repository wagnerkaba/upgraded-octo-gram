package com.example.springtest.injecaoDeDependencia;

public class Moto implements Veiculo{
    @Override
    public void acao() {
        System.out.println("É uma moto");
    }
}
