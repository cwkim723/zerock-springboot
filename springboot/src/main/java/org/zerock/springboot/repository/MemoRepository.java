package org.zerock.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.springboot.entity.Memo;

public interface MemoRepository extends JpaRepository<Memo, Long> {
}
