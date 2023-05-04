public class TVSet{

    private static volatile TVSet tvSetInstance = null;

    private TVSet(){
        System.out.println("TVSet Constructror called");
    }

    public  static TVSet getTVSetInstance(){
        if(tvSetInstance==null){
            synchronized(TVSet.class){
                if(tvSetInstance==null){
                  tvSetInstance = new TVSet();
                }
            }
        }
        return tvSetInstance;
    }

}