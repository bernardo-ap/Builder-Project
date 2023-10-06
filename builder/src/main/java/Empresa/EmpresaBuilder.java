package Empresa;

import com.sun.nio.sctp.IllegalReceiveException;

public class EmpresaBuilder {

    private Empresa empresa;

    public EmpresaBuilder(){
        empresa = new Empresa();
    }

    public Empresa build(){
        if (empresa.getNomeFantasia().equals("") ){
            throw new IllegalArgumentException("Nome fantasia inválido");
        }
        if (empresa.getNomeCeo().equals("")){
            throw new IllegalArgumentException("Nome Ceo inválido");
        }
        return empresa;
    }

    public EmpresaBuilder setNomefantasia(String nome){
        empresa.setNomeFantasia(nome);
        return this;
    }

    public EmpresaBuilder setQntdFuncionarios(int numero) {
        empresa.setQntdFuncionarios(numero);
        return this;
    }

    public EmpresaBuilder setRendimentoMensal(float valor) {
        empresa.setRendimentoMensal(valor);
        return this;
    }

    public EmpresaBuilder setRendimentoAnual(float valor) {
        empresa.setRendimentoAnual(valor);
        return this;
    }

    public EmpresaBuilder setNomeCeo(String nome) {
        empresa.setNomeCeo(nome);
        return this;
    }

    public EmpresaBuilder setLogradouro(String logradouro) {
        empresa.setLogradouro(logradouro);
        return this;
    }

}

