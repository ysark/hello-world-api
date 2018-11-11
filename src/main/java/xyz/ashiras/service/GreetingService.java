package xyz.ashiras.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author
 */
@Component // Spring で管理されるコンポーネント
@Transactional // 本来はここでトランザクションを管理する。今回は GreetingRepository にアクセスするだけなのであまり意味は無い
public class GreetingService {

  @Autowired // Spring で管理されているコンポーネントから GreetingRepository であるクラスを取ってくる
  GreetingRepository repository;

  public List<String> searchByTitle(String title) {
    return repository.searchByTitle(title);
  }

  // public List<String> findAll() {
  // return repository.();
  // }
}