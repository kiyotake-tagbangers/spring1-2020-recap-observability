package jp.co.tagbangers.demo;

import lombok.Getter;
import org.hibernate.annotations.Type;
import org.springframework.data.domain.Persistable;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

/**
 * @author KIYOTA, Takeshi
 */
@Entity
@Getter
public class Snack extends AbstractPersistable<UUID> {

    private String name;

}
