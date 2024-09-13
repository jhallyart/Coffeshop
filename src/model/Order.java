package model;

public class Order {
	 private String name;
	   private Integer latte;
	   private Integer blackcoffee;
	   private Integer cappuccino;
	   private Integer sum;
	   private Integer finalPrice;
	   public Order(String name, Integer latte, Integer blackcoffee, Integer cappuccino, double discountRate) {
	       this.name = name;
	       this.latte = latte;
	       this.blackcoffee = blackcoffee;
	       this.cappuccino = cappuccino;
	       this.sum = this.latte * 140 + this.blackcoffee * 70 + this.cappuccino * 120;
	       this.finalPrice = calculateDiscount(this.sum, discountRate);
	   }
	   private Integer calculateDiscount(Integer sum, double discountRate) {
	       return (int) (sum * discountRate);
	   }
	   public String getName() {
	       return name;
	   }
	   public Integer getLatte() {
	       return latte;
	   }
	   public Integer getBlackcoffee() {
	       return blackcoffee;
	   }
	   public Integer getCappuccino() {
	       return cappuccino;
	   }
	   public Integer getSum() {
	       return sum;
	   }
	   public Integer getFinalPrice() {
	       return finalPrice;
	   }
	}

