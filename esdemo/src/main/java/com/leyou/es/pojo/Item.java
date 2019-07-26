package com.leyou.es.pojo;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Data
@Document(indexName = "lfc",type = "item",shards = 1)
public class Item {

    @Field(type = FieldType.Long)
    @Id
    Long id;

    @Field(type = FieldType.Text ,analyzer = "ik_smart")
    String title;

    @Field(type = FieldType.Keyword)
    String category;
    @Field(type = FieldType.Keyword)
    String brand;

    @Field(type = FieldType.Double)
    Double price;
    @Field(type = FieldType.Keyword,index = false)
    String images;
}
