package io.github.amitghosh.model.entity.db;

import io.github.amitghosh.model.entity.common.EntityCommon;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author Amit Ghosh
 */
@Entity
@NoArgsConstructor
@Table(name = "USER_ROLES")
@Data(staticConstructor = "of")
@EqualsAndHashCode(callSuper = true)
public class UserRoles extends EntityCommon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "USER_ID")
    private Long userId;

    @Column(name = "ROLE_ID")
    private Long roleId;

    @Column(name = "ROLE_NAME")
    private String roleName;
}
