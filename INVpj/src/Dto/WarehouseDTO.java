package Dto;

public class WarehouseDTO {
   private String W_code;
   private String w_name;
   private String exp;
   
   public String getW_code() {
      return W_code;
   }
   public void setW_code(String w_code) {
      W_code = w_code;
   }
   public String getW_name() {
      return w_name;
   }
   public void setW_name(String w_name) {
      this.w_name = w_name;
   }
   public String getExp() {
      return exp;
   }
   public void setExp(String exp) {
      this.exp = exp;
   }
   @Override
   public String toString() {
      return "창고코드:" + W_code +", 창고명:"
            + ""+  w_name + " 창고" + ", 창고 설명: " + exp ;
   }
   
}