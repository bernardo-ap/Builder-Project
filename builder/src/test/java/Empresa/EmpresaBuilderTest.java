package Empresa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaBuilderTest {

    @Test
    void deveRetornarExcecaoParaEmpresaSemNomeFantasia() {
        try {
            EmpresaBuilder alunoBuilder = new EmpresaBuilder();
            Empresa empresa = alunoBuilder
                    .setNomeCeo("Bernardo")
                    .setRendimentoAnual(900)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome fantasia inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaEmpresaSemNomeCeo() {
        try {
            EmpresaBuilder empresaBuilder = new EmpresaBuilder();
            Empresa empresa = empresaBuilder
                    .setNomefantasia("Empresa Fantasia")
                    .setRendimentoMensal(120)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome Ceo inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarAlunoValido() {
        EmpresaBuilder empresaBuilder = new EmpresaBuilder();
        Empresa empresa = empresaBuilder
                .setNomefantasia("Bernardo empresa")
                .setNomeCeo("Bernardo")
                .build();
        assertNotNull(empresa);
    }

}