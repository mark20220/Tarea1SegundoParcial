
/**
 * Write a description of class Ejercicio2V2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio2V2
{
    public String PadovanV2(int Num){
        int Aux;
        int Ult=1;
        int PenUlt=0;
        int Actual=1;
        String Res="1";
        for(int i=1; i<Num; i++){
            Aux=Ult+PenUlt;
            Ult=PenUlt;
            PenUlt=Actual;
            Actual=Aux;
            Res=Res+"-"+Actual;
        }
        return Res;
    }
}
