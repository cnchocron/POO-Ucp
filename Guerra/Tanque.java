public class Tanque 
            extends Participante
{
    public String getNombreCompleto(){
        return getNombre()+" (Tanque)";
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
        return 400;
    }
    
    public int danioMenosAvion(){
        return 640;
    }
    
    public int danioMenosSoldado(){
        return 800;
    }
    
    public void disparar(Participante enemigo){
        
        //Ejemplo 1
        //enemigo.danio(400);
        
        //Ejemplo 2
//         if(enemigo instanceof Tanque){
//             enemigo.danio(500);
//         }else if(enemigo instanceof Avion){
//             enemigo.danio(200);
//         }else if(enemigo instanceof Soldado){
//             enemigo.danio(700);
//         }
        
    //Ejemplo 3
    enemigo.danio(enemigo.danioParaTanque());
      enemigo.danio(enemigo.danioParaAvion());
        enemigo.danio(enemigo.danioParaSoldado());
        
    }
    
    public int danioParaTanque(){
        return 500;
    }
    
    public int danioParaAvion(){
        return 800;
    }
    
    public int danioParaSoldado(){
        return 1000;
    }
}
