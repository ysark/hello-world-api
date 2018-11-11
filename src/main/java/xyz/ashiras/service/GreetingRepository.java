package xyz.ashiras.service;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author
 */
@Repository // Springにコンポーネントとして管理されるDBにアクセスするためのクラス
public interface GreetingRepository extends JpaRepository<String, Long> {
  @Query("select b from Book b where b.title like %:title%")
  List<String> searchByTitle(String title);
}