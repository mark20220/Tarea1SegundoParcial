
/**
 * Write a description of class ejercicio2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio2
{
    public int Padovan(int Num){
        int Aux;
        int Ult=1;
        int PenUlt=0;
        int Actual=1;
        for(int i=1; i<Num; i++){
            Aux=Ult+PenUlt;
            Ult=PenUlt;
            PenUlt=Actual;
            Actual=Aux;
        }
        return Actual;
    }
}
