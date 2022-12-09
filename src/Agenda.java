import java.sql.SQLOutput;
import java.util.ArrayList;

public class Agenda {
    private static ArrayList<Consulta> consultas = new ArrayList<Consulta>();

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(ArrayList<Consulta> consultas) {
        this.consultas = consultas;
    }

    public static void adicionar(Consulta consulta){
        if(consultas.size() == 0) {
            System.out.println("Consulta cadastrada com Sucesso.");
            consultas.add(consulta);
        } else {
            for(Consulta item : consultas) {
                if(item.getDia() == consulta.getDia() && item.getMes() == consulta.getMes() && item.getAno() == consulta.getAno() && item.getHora() == consulta.getHora()) {
                    System.out.println("Horário Ocupado.");
                    break;
                } else {
                    System.out.println("Consulta cadastrada com Sucesso.");
                    consultas.add(consulta);
                    break;
                }
            }
        }

    }

    public static void confirmar(Consulta consulta){
        for(Consulta item : consultas) {
            if(item.getDia() == consulta.getDia() && item.getMes() == consulta.getMes() && item.getAno() == consulta.getAno() && item.getHora() == consulta.getHora() && item.getStatus() == 0){
                System.out.println("Consulta Confirmada.");
                item.setStatus(1);
                break;
            } else if (item.getDia() == consulta.getDia() && item.getMes() == consulta.getMes() && item.getAno() == consulta.getAno() && item.getHora() == consulta.getHora() && item.getStatus() != 0) {
                System.out.println("Status inválido.");
                break;
            }
            if(item.getDia() != consulta.getDia() && item.getMes() != consulta.getMes() && item.getAno() != consulta.getAno() && item.getHora() != consulta.getHora()) {
                System.out.println("Consulta não encontrada");
            }
        }

    }
    public static void realizar(Consulta consulta){
        for(Consulta item : consultas) {
            if(item.getDia() == consulta.getDia() && item.getMes() == consulta.getMes() && item.getAno() == consulta.getAno() && item.getHora() == consulta.getHora() && item.getStatus() == 1){
                System.out.println("Consulta Realizada.");
                item.setStatus(2);
                break;
            } else if (item.getDia() == consulta.getDia() && item.getMes() == consulta.getMes() && item.getAno() == consulta.getAno() && item.getHora() == consulta.getHora() && item.getStatus() != 1) {
                System.out.println("Status inválido.");
                break;
            }
            if(item.getDia() != consulta.getDia() && item.getMes() != consulta.getMes() && item.getAno() != consulta.getAno() && item.getHora() != consulta.getHora()) {
                System.out.println("Consulta não encontrada");
            }
        }

    }
    public static void cancelar(Consulta consulta){
        for(Consulta item : consultas) {
            if(item.getDia() == consulta.getDia() && item.getMes() == consulta.getMes() && item.getAno() == consulta.getAno() && item.getHora() == consulta.getHora()) {
                if(item.getStatus() == 0 || item.getStatus() == 1) {
                    System.out.println("Consulta Cancelada.");
                    item.setStatus(3);
                } else {
                    System.out.println("Status inválido.");
                }
                break;
            }
            if(item.getDia() != consulta.getDia() && item.getMes() != consulta.getMes() && item.getAno() != consulta.getAno() && item.getHora() != consulta.getHora()) {
                System.out.println("Consulta não encontrada");
            }
        }
    }



    public static void listar(int dia , int mes, int ano){
        for(Consulta item : consultas) {
            if(item.getDia() == dia && item.getMes() == mes && item.getAno() == ano) {
                System.out.println("Consultas do dia: ");
                item.mostrar();
            }
        }
    }
    public static void pesquisar(String cpf){
        if (consultas.size() == 0) {
            System.out.println("Nenhuma consulta foi Cadastrada.");
        } else {
            for(Consulta item : consultas) {
                if(item.getPaciente().getCpf().equals(cpf)) {
                    System.out.println("Consultas cadastradas: ");
                    item.mostrar();
                } else {
                    System.out.println("consulta não encontrada para cpf informado: " + item.getPaciente().getCpf());
                }
            }
        }
    }
}
