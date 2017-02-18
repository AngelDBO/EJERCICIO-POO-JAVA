package Carro;

public class Viaje {

    private String codigor;
    private String inicio;
    private String destino;
    private Float valorkm, valorApagar;

    //Metodosa constructores
    Viaje() {
        codigor = "";
        inicio = "";
        destino = "";
        valorApagar = valorkm = 0.0f;

    }

    public Float getValorApagar() {
        return valorApagar;
    }

    public void setValorApagar(Float valorApagar) {
        this.valorApagar = valorApagar;
    }

    public String getCodigor() {
        return codigor;
    }

    public void setCodigor(String codigoR) {
        this.codigor = codigoR;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Float getValorkm() {
        return valorkm;
    }

    public void setValorkm(Float valorkm) {
        this.valorkm = valorkm;
    }

    public void setcostoruta(float valor) {
        this.valorApagar = this.valorkm;
        this.valorApagar *= valor;
    }

}
