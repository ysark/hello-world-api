package xyz.ashiras.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import xyz.ashiras.model.Books;

/**
 *
 * @author Fumio SAGAWA
 */
@Component // Spring で管理されるコンポーネント
@Transactional // 本来はここでトランザクションを管理する。今回は GreetingRepository にアクセスするだけなのであまり意味は無い
public class GreetingService {

  @Autowired // Spring で管理されているコンポーネントから GreetingRepository であるクラスを取ってくる
  GreetingRepository repository;

  public List<Books> findAll() {
    return repository.findAll();
  }

  public List<Books> searchByName(final String name) {
    return repository.searchByName(name);
  }
}