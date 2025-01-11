package com.leonardo.cursomc.domain.DTO;

import com.leonardo.cursomc.domain.Cliente;

public class ClienteDTO {
    private String nome;
    private String email;
    private String cpfOuCnpj;
    private Integer tipo;

    public ClienteDTO(){}
    public ClienteDTO(Integer id, String nome, String email, String cpfOuCnpj, Integer tipo) {
        this.nome = nome;
        this.email = email;
        this.cpfOuCnpj = cpfOuCnpj;
        this.tipo = tipo;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpfOuCnpj() {
        return cpfOuCnpj;
    }

    public void setCpfOuCnpj(String cpfOuCnpj) {
        this.cpfOuCnpj = cpfOuCnpj;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }


}
