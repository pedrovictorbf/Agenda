public class Consulta {

    private Paciente paciente;
    private int dia;

    private int mes;

    private int ano;

    private int hora;

    private int status;

    public Consulta(Paciente paciente , int dia, int mes, int ano, int hora){
        this.paciente = paciente;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
        this.status = 0;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void mostrar() {
        this.getPaciente().mostrar();
        System.out.println("A data da consulta é dia: " + this.getDia() + "/" + this.getMes() + "/" + this.getAno());
        System.out.println("Sua consulta é às " + this.getHora() + " horas.");
        if(this.getStatus() == 0) {
            System.out.println("Sua consulta está marcada.");
        }
        if(this.getStatus() == 1){
            System.out.println("Sua consulta está confirmada.");
        }

    }
}
