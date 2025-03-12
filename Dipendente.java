public class Dipendente {
    private String matricola;
    private double stipendio;
    private double straordinario;

    public Dipendente(tring matricola, double stipendio, double straordinario){
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.straordinario = straordinario;
    }

    public double getStipendio{
        return stipendio;
    }

     public double paga(int ore){
        return ore * straordinario
    }

   
}

public void Stampa() {

System.out.println("numero di matricola:" + matricola);
System.out.println("stipendio:" + stipendio);
System.out.println("straordinari:" + straordinario);

}