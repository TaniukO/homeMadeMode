package ua.saniok.web.shop.model.entity;

import ua.saniok.web.shop.model.CasheConn;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Map;


/**
 * Created by sAnCho on 17.08.2016.
 */
public class DB_Product {

    private int idP;
    private String nameP;
    private String description;
    private double prise;
    private String mainImg;
    private String cetegory;
    private List<String> images;
    private Map<String,String> features;

    public DB_Product(int idP, String nameP, String description, double prise, String mainImg, String cetegory, List<String> images, Map<String, String> features) {
        this.idP = idP;
        this.nameP = nameP;
        this.description = description;
        this.prise = prise;
        this.mainImg = mainImg;
        this.cetegory = cetegory;
        this.images = images;
        this.features = features;
    }


}
