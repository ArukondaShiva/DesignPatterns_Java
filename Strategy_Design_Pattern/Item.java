public class Item {
    
    private String upcCode;
    private int price;

    public Item(String _upcCode,int _price){
        upcCode = _upcCode;
        price = _price;
    }

    public String getUpcCode(){
        return upcCode;
    }

    public int getPrice(){
        return price;
    }

}
