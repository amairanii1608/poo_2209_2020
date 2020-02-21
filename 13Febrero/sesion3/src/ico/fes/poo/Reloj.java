
package ico.fes.poo;


public class Reloj {
    private int hora;
    private int minuto;
    private int segundo;
    private boolean contador=true;

  
  
    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public in getHora() {
        return hora;
    }
    
    public void setHora(int hora) {
        this.hora = hora;
    }
    
    public in getSegundo(int segundo) {
        return segundo;
    }   

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
    
    public void mostrarHora(){
        System.out.println(this.hora + ":"+this.minuto + ":"+this.segundo);
        
        while(contador=true){
    }
    
}
