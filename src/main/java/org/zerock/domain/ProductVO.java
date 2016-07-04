package org.zerock.domain;

/**
 * Created by JeongHeon on 2016. 7. 4..
 * SampleController ProductVO 사용하기 위해 생성
 */
public class ProductVO {
    private String name;
    private double price;

    public ProductVO(String name, double price){
        super();
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    @Override
    public String toString(){
        return "ProductVO [name=" + name + ", price=" + price + "]";
    }
}
