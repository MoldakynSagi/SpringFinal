package kz.spring.demo.repository;

import kz.spring.demo.entity.Text;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TextRepository extends JpaRepository<Text, Long> {
    List<Text> getTextByMusicId(Long id);
}
