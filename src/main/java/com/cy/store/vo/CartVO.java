package com.cy.store.vo;
import java.io.Serializable;

/** 购物车数据的Value Object类 */
public class CartVO implements Serializable {
    private Integer cid;
    private Integer uid;
    private Integer pid;
    private Long price;
    private Integer num;
    private String title;
    private Long realPrice;
    private String image;

    @Override
    public String toString() {
        return "CartVO{" +
                "cid=" + cid +
                ", uid=" + uid +
                ", pid=" + pid +
                ", price=" + price +
                ", num=" + num +
                ", title='" + title + '\'' +
                ", realPrice=" + realPrice +
                ", image='" + image + '\'' +
                '}';
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CartVO)) return false;

        CartVO cartVO = (CartVO) o;

        if (cid != null ? !cid.equals(cartVO.cid) : cartVO.cid != null) return false;
        if (uid != null ? !uid.equals(cartVO.uid) : cartVO.uid != null) return false;
        if (pid != null ? !pid.equals(cartVO.pid) : cartVO.pid != null) return false;
        if (price != null ? !price.equals(cartVO.price) : cartVO.price != null) return false;
        if (num != null ? !num.equals(cartVO.num) : cartVO.num != null) return false;
        if (title != null ? !title.equals(cartVO.title) : cartVO.title != null) return false;
        if (realPrice != null ? !realPrice.equals(cartVO.realPrice) : cartVO.realPrice != null) return false;
        return image != null ? image.equals(cartVO.image) : cartVO.image == null;
    }

    @Override
    public int hashCode() {
        int result = cid != null ? cid.hashCode() : 0;
        result = 31 * result + (uid != null ? uid.hashCode() : 0);
        result = 31 * result + (pid != null ? pid.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (num != null ? num.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (realPrice != null ? realPrice.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        return result;
    }
}