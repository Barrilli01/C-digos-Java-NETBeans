package newnota3;

public class Usuario {
    
    private String nome;
    private String email;
    private String cpf;
    private String senha;
    private String celular;
    private String veiculo;
    private String placa;
    private String unidade;
    private String bloco;

    public Usuario(String nome, String email, String cpf, String senha, String celular, String veiculo, String placa, String unidade, String bloco) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.senha = senha;
        this.celular = celular;
        this.veiculo = veiculo;
        this.placa = placa;
        this.unidade = unidade;
        this.bloco = bloco;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }
    
    private String usuario1;
    private String usuario2;
    private String admin1;

    public String getUsuario1() {
        return usuario1;
    }

    public void setUsuario1(String usuario1) {
        this.usuario1 = usuario1;
    }

    public String getUsuario2() {
        return usuario2;
    }

    public void setUsuario2(String usuario2) {
        this.usuario2 = usuario2;
    }

    public String getAdmin1() {
        return admin1;
    }

    public void setAdmin1(String admin1) {
        this.admin1 = admin1;
    }

    
}