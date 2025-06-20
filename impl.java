
class impl extends methods {
    methods m = new methods();
    private int price;
    private boolean veg;
    private int result;
    public void pizza(boolean veg){
        this.veg = veg;
        if(this.veg){
            this.price = 300;    
        }
        else{
            this.price = 400;
        }
        m.setprice(this.price);
    }    
    public void bill(){
        System.out.println("Total Bill: "+m.getbill());
        this.price = m.getbill(); 

    }
    public void cheese(){
        System.out.println("Extra cheese added: 100");
        m.setbill(this.price + 100);
        bill();
    }

    public void topping(){
        System.out.println("Extra Topping added: 100");
        m.setbill(this.price + 100);
        bill();
    }
    public void takeaway(){
        System.out.println("Backpack: ");
        m.setbill(this.price+20);
        bill();
    }
    

}