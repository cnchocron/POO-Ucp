public class Soldado 
                extends Participante
{
     public String getNombreCompleto(){
        return getNombre()+" (Soldado)";
    }
    
    public String getActivarEscudo(){
        return getEscudo()+" (Escudo Activado)";
    }
    
    public void escudo(Participante enemigo){
         
        enemigo.escudo(enemigo.danioMenosTanque());
        enemigo.escudo(enemigo.danioMenosAvion());
        enemigo.escudo(enemigo.danioMenosSoldado());
    }
    
    public int danioMenosTanque(){
        return 160;
    }
    
    public int danioMenosAvion(){
        return 120;
    }
    
    public int danioMenosSoldado(){
        return 200;
    }
    
    
    public void disparar(Participante enemigo){
        
        //Ejemplo 1
        //enemigo.danio(400);
        
        //Ejemplo 2
//         if(enemigo instanceof Tanque){
//             enemigo.danio(250);
//         }else if(enemigo instanceof Avion){
//             enemigo.danio(650);
//         }else if(enemigo instanceof Soldado){
//             enemigo.danio(450);
//         }
        
        
         enemigo.danio(enemigo.danioParaTanque());
         enemigo.danio(enemigo.danioParaAvion());
        enemigo.danio(enemigo.danioParaSoldado());
    }
    
    public int danioParaTanque(){
        return 200;
    }
    
    public int danioParaAvion(){
        return 150;
    }
    
    public int danioParaSoldado(){
        return 250;
    }
    }