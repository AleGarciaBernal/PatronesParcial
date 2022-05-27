package primerParcial.Prototype;

import estructurasDelProfe.prototype.structure.IPrototype;

public class CelularA1 implements IPrototype {

    private String modelo;
    private String peso;
    private String tamanio;
    private String camara;
    private String imei;
    private String origen;


    public CelularA1(){
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public Object clone() {
        CelularA1 clone= new CelularA1();
        clone.setModelo(this.getModelo());
        clone.setTamanio(this.getTamanio());
        clone.setPeso(this.getPeso());
        clone.setCamara(this.getCamara());
        clone.setImei(this.getImei());
        clone.setOrigen(this.getOrigen());
        return clone;
    }
    public void showInfo(){
        System.out.println("modelo: "+this.getModelo());
        System.out.println(" tamaño: " +this.getTamanio());
        System.out.println(" peso: "+this.getPeso());
        System.out.println(" camara: "+this.getCamara());
        System.out.println(" Imei: "+this.getImei());
        System.out.println(" pais de Origen: "+this.getOrigen());
    }
}
