package br.com.organizacao_financeira.demo.repository;

import br.com.organizacao_financeira.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
