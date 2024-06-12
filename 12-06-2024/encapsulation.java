public class encapsulation {
    private String date;
    public void getDate(){
        System.out.println(date);
     
        }
        public void setDate(String date){
            this.date=date;
            }
            public static void main(String[] args) {
                encapsulation obj = new encapsulation();
                obj.setDate("hello");
                obj.getDate();
                }   
                }
