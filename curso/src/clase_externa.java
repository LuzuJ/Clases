package curso.src;

public class clase_externa {
     int x = 30;

    ////con private no sirve, con protected y public si 
    ////con static tampoco pero depende
    //public class clase_interna {
    //    int y = 20;
    //}
    public class clase_interna{
        //constructor
        public int obj_interno_metodo(){
            return x;
            
        }
    }
}
