package xyz.ashiras.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // JPAのエンティティ(DBとJavaをマッピングしているクラス)
@Table(name = "BOOKS") // DBに作成されるテーブル名称
public class Books {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private final String name;

  public Books(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
