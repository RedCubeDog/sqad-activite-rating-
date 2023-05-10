package ru.redcube.squadrating.repositories.user;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.redcube.squadrating.entity.user.SquadUser;

public interface AppUserRepository extends JpaRepository<SquadUser, Long> {

}
