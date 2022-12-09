public class Main {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente(
                "Pedro" ,
                "Fernandes" ,
                "123" ,
                "85996245454")
                ;

        Paciente paciente2 = new Paciente(
                "Maria",
                "Aragão",
                "456",
                "85123456"
        );

        Consulta consulta1 = new Consulta(paciente1, 10,5,2022,12);
        Consulta consulta2 = new Consulta(paciente2 ,11,5,2022,12);

        Agenda.adicionar(consulta1);
        Agenda.adicionar(consulta2);

        Agenda.confirmar(consulta1);
        Agenda.confirmar(consulta2);

        Agenda.realizar(consulta1);

        Agenda.cancelar(consulta1);
        Agenda.cancelar(consulta2);


//        Agenda.listar(9,5,2022);
    }

}