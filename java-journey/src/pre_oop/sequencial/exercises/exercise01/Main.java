package pre_oop.sequencial.exercises.exercise01;
public class Main {
    public static void main (String[] args){
        StringBuilder sb = new StringBuilder();
        sb.append("Olá!, ");
        sb.append("me chamo Leonardo.");
        sb.append(" Tenho ");
        sb.append(19);
        sb.append(" anos");
        String resultado = sb.toString();
        System.out.println(sb.toString());
        System.out.println(resultado);
    }
}
