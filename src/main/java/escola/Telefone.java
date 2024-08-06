package escola;

public class Telefone {
    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {

        if (!ddd.matches("^\\d{2}$\n") || !numero.matches("^\\d{8,9}$\n")){
            throw new IllegalArgumentException("Formato do telefone invalido");
        }

        if (ddd == null || numero == null){
            throw new IllegalArgumentException("DDD e numero obrigatorios");
        }

        this.ddd = ddd;
        this.numero = numero;
    }
}
