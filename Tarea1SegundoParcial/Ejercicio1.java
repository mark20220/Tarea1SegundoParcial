
/**
 * Write a description of class Serie1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio1
{
    public int Serie(int Num){
        int Cont=1;
        int Res=1;
        for(int i=1;i<Num;i++){
            if(Cont==4){
                Res=Res+(Cont-2);
                Cont=1;
            }else{
                Res=Res+Cont;
                Cont++;
            }
        }
        return Res;
    }
}
