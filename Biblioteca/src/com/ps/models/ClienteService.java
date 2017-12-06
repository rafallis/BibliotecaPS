package com.ps.models;

public class ClienteService {

    private String nome;

    private int matricula;

    private String telefonePessoal;
    
    private String senha;
    
    public ClienteService(String nome, int matricula, String telefonePessoal, String senha) {
        this.nome = nome;
        this.matricula = matricula;
        this.telefonePessoal = telefonePessoal;
        this.senha = senha;
    }
    
    public ClienteService(int matricula, String senha) {
        this.matricula = matricula;
        this.senha = senha;
    }
    
    public boolean validaCliente() {
        ClienteData cd = new ClienteData();
        cd.validaUsuario(this);
        
        //se tudo der certo retorna
        return true;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getTelefonePessoal() {
        return telefonePessoal;
    }

    public void setTelefonePessoal(String telefonePessoal) {
        this.telefonePessoal = telefonePessoal;
    }
}
