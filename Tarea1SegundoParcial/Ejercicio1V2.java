
/**
 * Write a description of class SerieV2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio1V2
{
    public String SerieV2(int Num){
        int Cont=1;
        int Res=1;
        String Result="1";
        for(int i=1;i<Num;i++){
            if(Cont==4){
                Res=Res+(Cont-2);
                Cont=1;
                Result=Result+" "+Res;
            }else{
                Res=Res+Cont;
                Cont++;
                Result=Result+" "+Res;
            }
        }
        return Result;
    }
}
