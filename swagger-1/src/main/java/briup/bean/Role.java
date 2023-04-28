package briup.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author zqq
 * @date 2022/10/25
 */
@Entity
@Table
public class Role {
    @Id
    private Integer id;
    @Column
    private String name;
    @Column
    private String description;
}
