public class Avion extends Participante
{
    public String getNombreCompleto(){
        return getNombre()+" (Avion)";
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
        return 280;
    }
    
    public int danioMenosAvion(){
        return 400;
    }
    
    public int danioMenosSoldado(){
        return 320;
    }
    
    public void disparar(Participante enemigo){
        
        //Ejemplo 1
        //enemigo.danio(400);
        
        //Ejemplo 2
//         if(enemigo instanceof Tanque){
//             enemigo.danio(600);
//         }else if(enemigo instanceof Avion){
//             enemigo.danio(500);
//         }else if(enemigo instanceof Soldado){
//             enemigo.danio(200);
//         }
    enemigo.danio(enemigo.danioParaTanque());
    enemigo.danio(enemigo.danioParaAvion());
        enemigo.danio(enemigo.danioParaSoldado());
    }
    
    public int danioParaTanque(){
        return 350;
    }
    
    public int danioParaAvion(){
        return 500;
    }
    
    public int danioParaSoldado(){
        return 400;
    }
}
