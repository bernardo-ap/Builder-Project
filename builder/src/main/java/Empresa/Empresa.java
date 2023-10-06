package Empresa;

public class Empresa {

    private String nomeFantasia;
    private int qntdFuncionarios;
    private float rendimentoMensal;
    private float rendimentoAnual;
    private String nomeCeo;
    private String logradouro;

    public Empresa(){
        this.nomeFantasia = "";
        this.nomeCeo = "";
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public int getQntdFuncionarios() {
        return qntdFuncionarios;
    }

    public void setQntdFuncionarios(int qntdFuncionarios) {
        this.qntdFuncionarios = qntdFuncionarios;
    }

    public float getRendimentoMensal() {
        return rendimentoMensal;
    }

    public void setRendimentoMensal(float rendimentoMensal) {
        this.rendimentoMensal = rendimentoMensal;
    }

    public float getRendimentoAnual() {
        return rendimentoAnual;
    }

    public void setRendimentoAnual(float rendimentoAnual) {
        this.rendimentoAnual = rendimentoAnual;
    }

    public String getNomeCeo() {
        return nomeCeo;
    }

    public void setNomeCeo(String nomeCeo) {
        this.nomeCeo = nomeCeo;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
}
