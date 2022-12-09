public class Paciente {
    private String nome;
    private String sobrenome;
    private String cpf;
    private String telefone;

    public Paciente(String nome, String sobrenome, String cpf, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void mostrar() {
        System.out.println("Paciente: " + this.getNome() + " " + this.getSobrenome());

        System.out.println("CPF: " + this.getCpf());

        System.out.println("Telefone: " + this.getTelefone());

    }
}
