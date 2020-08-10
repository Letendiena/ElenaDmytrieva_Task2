package ai.skillo;

public class Printer {
    private String color;
    public String material;
    int length;
    boolean blackAndWhitInk;
    private int price;

   public Printer() {
        color = "grey";
        material = "plastic";
        length = 40;
        blackAndWhitInk = true;
        price = 500;
   }

           public String getColor() {
               return color;
           }
               public void setColor (String color){
                   this.color = color;
               }

            public int getPrice () {
            return price;
               }
             public void setPrice(int price) {
              this.price = price;
          }

}


//    String print(String text) {
//        System.out.println(text);
//        return text;
   // }
