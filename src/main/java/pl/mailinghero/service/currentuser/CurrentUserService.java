package pl.mailinghero.service.currentuser;

import pl.mailinghero.domain.CurrentUser;

public interface CurrentUserService {

    boolean canAccessUser(CurrentUser currentUser, Long userId);

}
