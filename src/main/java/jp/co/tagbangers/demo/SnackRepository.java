package jp.co.tagbangers.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * @author KIYOTA, Takeshi
 */
public interface SnackRepository extends JpaRepository<Snack, UUID> {
}
